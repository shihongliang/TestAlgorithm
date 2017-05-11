import java.util.ArrayList;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class FirstAppearingOnce {
	
	 int[] chars = new int[256];
	    int index = 0;
	    //Insert one char from stringstream
	    public void Insert(char ch)
	    {
	        if(index == 0){
	            for(int i = 0; i < chars.length; i++){
	                chars[i] = -1;
	            }
	        }
	         
	        if(chars[ch] == -1){
	            chars[ch] = index;
	        }else{
	            chars[ch] = -2;
	        }
	 
	        index++;
	    }
	  //return the first appearence once char in current stringstream
	    public char FirstAppearingOnce()
	    {
	        int minIndex = Integer.MAX_VALUE;
	        char value = '#';
	        for(int i = 0; i < chars.length; i++){
	            if(chars[i] >= 0 && chars[i] < minIndex){
	                minIndex = chars[i];
	                value = (char)i;
	            }
	        }
	 
	        return value;
	    }
	
	    public static void main(String[]args)
	    {
	 
	    	
	    }
	    
}
