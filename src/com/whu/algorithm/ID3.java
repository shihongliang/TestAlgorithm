/**
 * 
 */
package com.whu.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;



/**
 * @author hongliang
 *
 */
public class ID3 {
	
	 private ArrayList<String> attribute=new ArrayList<String>();
	 private ArrayList<ArrayList<String>> attributevalue=new ArrayList<ArrayList<String>>();
	 private ArrayList<String[]> data=new ArrayList<String[]>();
	 private int decatt;
	 public static final String patternString= "@attribute(.*)[{](.*?)[}]";
	 private Document xmldoc;
	 private Element root;
	 
	 public ID3()
	 {
		 xmldoc=DocumentHelper.createDocument();
		 root=xmldoc.addElement("root");
		 
		 root.addElement("DecisionTree").addAttribute("value", "null");
	 }
	
	 public static void main(String[]args)
	 {
		 ID3 inst=new ID3();
		 inst.readARFF(new File("/home/orisun/test/weather.nominal.arff"));
		 inst.setDec("play");;
		 LinkedList<Integer> ll=new LinkedList<Integer>();
		 for(int i=0;i<inst.attribute.size();i++)
		 {
			 if(i!=inst.decatt)
			 {
				 ll.add(i);
			 }
		 }
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 for(int i=0;i<inst.data.size();i++)
		 {
			 al.add(i);
		 }
		 inst.buildDT("DecisionTree", "null", al, ll);
	     inst.writeXML("/home/orisun/test/dt.xml");
	     return;
		 
	 }

	/**
	 * @param string
	 */
	private void writeXML(String string) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param string
	 * @param string2
	 * @param al
	 * @param ll
	 */
	private void buildDT(String name, String value, ArrayList<Integer> subset, LinkedList<Integer> selatt) {
		Element ele=null;
		List<Element> list=root.selectNodes("//"+name);
		Iterator<Element> iter=list.iterator();
		while(iter.hasNext())
		{
			ele=iter.next();
			if(ele.attribute("value").equals(value))
			{
				break;
			}
			
			if(infoPure(subset))
			{
				ele.setText(data.get(subset.get(0))[decatt]);
			}
			
		}
		
	}

	/**
	 * @param subset
	 * @return
	 */
	private boolean infoPure(ArrayList<Integer> subset) {
		String value=data.get(subset.get(0))[decatt];
		for(int i=0;i<subset.size();i++)
		{
			String next=data.get(subset.get(i))[decatt];
			if(!value.equals(next))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @param string
	 */
	private void setDec(String name) {
		int n=attribute.indexOf(name);
		setDec(n);
		
	}

	/**
	 * @param n
	 */
	private void setDec(int n) {
		if(n<0||n>=attribute.size())
		{
			System.err.println("决策变量指定错误");
			System.exit(2);
		}
		decatt=2;
	}

	/**
	 * @param file
	 */
	private void readARFF(File file) {
		
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			Pattern pattern=Pattern.compile(patternString);
			while((line=br.readLine())!=null)
			{
				Matcher matcher=pattern.matcher(line);
				if(matcher.find())
				{
					attribute.add(matcher.group(1).trim());
					String[] values=matcher.group(2).split(",");
					ArrayList<String> a1=new ArrayList<String>();
					for(String value:values)
					{
						 a1.add(value.trim());
					}
					attributevalue.add(a1);
				}
				else if(line.startsWith("@data"))
				{
					while((line=br.readLine())!=null)
					{
						if(line=="")
						{
							continue;
						}
						String[] row=line.split(",");
						data.add(row);
					}
				}
				else
				{
					continue;
				}
			}
			br.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
