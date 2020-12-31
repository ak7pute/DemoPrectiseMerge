package AllSetProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tree 
{
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(15);
		list.add(25);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add("abc:");
		list.add("xyz");
		
		System.out.println(list);
		
		Set set = new TreeSet(list);
		System.out.println(set);
		
		
	}

}
