import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "dog");
		map.put(2, "cat");
		map.put(3, "mouse");
		map.put(4, "horse");
		map.put(5, "sheep");
		
		String s = map.get(2);
		System.out.println(s);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int id = entry.getKey();
			String var1 = entry.getValue();
			
			System.out.println(id + " : " + var1);
		}
	}
}
