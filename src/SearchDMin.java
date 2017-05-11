/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class SearchDMin {
	
	
	public void process(int[]data)
	{
		
		//异或整个数组
		int xor=populateXORValue(data);
		//根据整个数组异或得到的值，判断哪一位要进行区分0或者1
		int position=populatePosition(xor);
		
		//根据不同位置上0或者1区分数组
		int[] numbers=populateNoRepeatNumber(data,position);
		
		//志存现一次的数字
		printTwoNumber(numbers);
		
		
	}

	/**
	 * @param numbers
	 */
	private void printTwoNumber(int[] numbers) {
		System.out.println(String.format("数组中出现次数的两个数字：%d,%d", numbers[0], numbers[1]));
		
	}

	/**
	 * @param data
	 * @param position
	 * @return
	 */
	private int[] populateNoRepeatNumber(int[] data, int position) {
		
		int num1=0,num2=0;
		for(int i=0;i<data.length;i++)
		{
			if(((data[i]>>position)&1)==1)
			{
				num1^=data[i];
			}
			else
				num2^=data[i];
		}
		
		return null;
	}

	/**
	 * @param xor
	 * @return
	 */
	private int populatePosition(int xorValue) {
		
		int position=0;
		while((xorValue&1)==0)
		{
			xorValue>>=1;
			position++;
		}
		
		return position;
	}

	/**
	 * @param data
	 * @return
	 */
	private int populateXORValue(int[] data) {
		
		int xor=0;
		for(int element:data)
		{
			xor^=element;
		}
		
		return xor;
	}
	
	public static void main(String[]args)
	{
		SearchDMin util=new SearchDMin();
		util.process(new int[]{1,3,5,4,5,3});
		
	}
	
	
}
