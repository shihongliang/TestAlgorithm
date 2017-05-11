import java.util.ArrayList;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class FindNumbersWithSum {
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(array==null||array.length<0)
			return null;
		int high=array.length-1;
		int low=0;
		while(low<high)
		{
			int curSum=array[low]+array[high];
			
			if(curSum==sum)
			{
				list.add(array[low]);
				list.add(array[high]);
				break;
			}
			else if(curSum>sum)
			{
				high--;
			}
			else
				low++;
			
		}
		
		
		return list;
        
    }
	public static void main(String[] args) {
        int[] array = new int[]{1,2,7,8,13,15};
        ArrayList<Integer> list = new FindNumbersWithSum().FindNumbersWithSum(array, 15);
        System.out.println(list);
    }
	
}
