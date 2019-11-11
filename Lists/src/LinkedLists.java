import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		for(Integer value : linkedList) {
			System.out.println(value);
		}
	}
}
