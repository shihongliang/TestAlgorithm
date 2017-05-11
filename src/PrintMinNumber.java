import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class PrintMinNumber {

	public static String PrintMinNumber(int [] numbers) {
		 
		 int n=numbers.length;
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 String s="";
		 for(int i=0;i<n;i++)
			 list.add(numbers[i]);
		 Collections.sort(list, new Comparator<Integer>(){
	
			public int compare(Integer str1, Integer str2) {
				String s1=str1+""+str2;
				System.out.println("---->"+s1);
				String s2=str2+""+str1;
				System.out.println("=====>"+s2);
				System.out.println( s1.compareTo(s2));
				return s1.compareTo(s2);
			}
			 
		 });
		 
		 for(int j:list)
		 {
			 s+=j;
		 }
		 System.out.println(s);
		 return s;
	
	    }
	 public static void main(String[]args)
	 {
		 int[] numbers=new int[]{32,3,321};
		 
		 PrintMinNumber(numbers);
		 
	 }
	 
}
