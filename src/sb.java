/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class sb {
 
    public static void findTheShit(int[] array) {
        for(int i = 0; i < array.length; i++)
        {
        	   array[array[i] % 20 ==0 ? 20 : (array[i] % 20)] += 20;
        	   System.out.println( array[array[i] % 20 ==0 ? 20 : (array[i] % 20)] += 20);
        }
         
 
        array[0] = 0;
        for(int i = 1; i <= 20; i++) {
            if(array[0] < (int)((array[i] - 1) / 20))
            {
            	 array[0] = (int)((array[i] - 1) / 20);
            	 System.out.println(array[0]);
            }
               
        }
         //比较出现最多次数的
        System.out.println("---出现次数最多的数字(" + array[0]  + "次)---");
        for(int i = 1; i <= 20; i++) {
            if(array[0] * 20 < array[i])
                System.out.println(i);
        }
    }
 
    public static void main(String[] args) {
        int[] rand = new int[50];
        for(int i = 0; i < 50; i++) {
            rand[i] = (int)(Math.random() * 20) + 1;
            System.out.print(rand[i] + "\t");
        }
        System.out.println();
        findTheShit(rand);
    }
}
