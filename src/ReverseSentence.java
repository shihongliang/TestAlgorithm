/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class ReverseSentence {
	 public static String ReverseSentence(String str) {
		
		 if(str.trim().equals(" "))
			 return str;
		 String[] a=str.split(" ");
		 StringBuffer sb=new StringBuffer();
		 for(int i=a.length;i>0;i--)
		 {
			 sb.append(a[i-1]);
			 if(i>1)
				 sb.append(" ");
		 }
		 
		 return sb.toString();   
	 }
	 
	 public static void main(String[]args)
	 {
		 String str="student a am I";
		 System.out.println(ReverseSentence(str));
	 }
	 
}
