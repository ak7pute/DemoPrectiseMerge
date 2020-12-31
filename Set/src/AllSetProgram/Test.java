package AllSetProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Set s = new HashSet();
		s.add(15);
		s.add(25);
		s.add(24);
		s.add(15);
		// s.add("abc");
		// s.add("xyz");
		// s.add("abc");
		System.out.println(s);

		Iterator itr = s.iterator();
		while (itr.hasNext()) 
		{
			int x = (int) itr.next();
			System.out.println(x);
		}
	}
}
