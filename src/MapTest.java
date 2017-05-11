import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author hongliang
 *
 */
public class MapTest {
	
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "abc");
		map.put("2", "degf");
		map.put("3", "hhhh");
		map.put("4", "bbbbbb");
		map.put("5", "ksksksk");
		System.out.println(map.entrySet());
		
	}
	
}
