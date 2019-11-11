import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		Iterator <String> it = l.iterator();
		
		for(String l1 : l) {
			System.out.println(l1);
		}
		
		while(it.hasNext()) {
			String s = it.next();
			if(s.equals("3")) {
				it.remove();
			}
		}
		for(String l1 : l) {
			System.out.println(l1);
		}
	}
}
