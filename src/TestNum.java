/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class TestNum {
	 public int MoreThanHalfNum_Solution(int [] array) {
		 
		 int length=array.length;
		
		 if(array.length<0||array==null)
		 {
			 return 0;
		 }
		 if(array.length==1)
		 {
			 return array[0];
		 }
		 
		 int[] tempArray=new int[8];
		 
		 for(int i=0;i<length;i++)
		 {
			 tempArray[i]=array[i];
		 }
		 
		 
		 for(int i=0;i<length;i++)
		 {
			 if(tempArray[i]==0)
				 continue;
			 for(int j=i+1;j<length;j++)
			 {
				 if(tempArray[j]!=tempArray[i]&&tempArray[j]==0)
				 {
					 tempArray[j]=0;
					 tempArray[i]=0;
					 break;
				 }
			 }
		 }
		 for(int i=0;i<length;i++)
		 {
			 System.out.println(tempArray[i]);
		 }
		 
		 int result=0;
		 
		 for(int i=0;i<length;i++)
		 {
			 if(tempArray[i]!=0)
			 {
				 result=tempArray[i];
				 break;
			 }
		 }
		 
		 int times=0;
		 for(int i=0;i<length;i++)
		 {
			 if(result==array[i])
				 times++;
		 }
		 
		 if(times*2<length)
		 return 0;
		 return result;
		 
	 }
}
