import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		test(treeMap);

	}
	public static void test(Map<Integer, String> map) {
		map.put(1, "dog");
		map.put(2, "cat");
		map.put(3, "mouse");
		map.put(4, "horse");
		map.put(5, "sheep");
		
		for(Integer key : map.keySet()) {
			String s = map.get(key);
			
			System.out.println(key + " : " + s);
		}
	}
}
