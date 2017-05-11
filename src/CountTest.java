import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class CountTest {
	
	public static void main(String[]args)
	{
		String str="11234356";
		Map<Character,Integer> strMap=new HashMap<Character,Integer>();
		
		int count=0;
		int num=0;
		for(int i=0;i<str.length();i++)
		{
		Character 	c=str.charAt(i);
			int temp=0;
			for(int j=0;j<str.length();j++)
			{
				num=str.indexOf(c,temp);
				if(num!=-1)
				{
					count++;
					temp=num+1;
					continue;
				}
				else
				{
					strMap.put(c, count);
					count=0;
					break;
				}
			}
		}
		
		Iterator iter1= strMap.keySet().iterator();
		while(iter1.hasNext())
		{
			Object key=iter1.hasNext();
			Object value=strMap.get(key);
			  System.err.println(key + "   的出现次数为：" + value+"  次");
		}
	}
	
	
}
