package AllSetProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Linked 
{
	public static void main(String[] args) {
	
		List list=new ArrayList();
		list.add(15);
		list.add(25);
		list.add(15);
		list.add(14);
		list.add(18);
		
		System.out.println(list);
		
		Set s = new LinkedHashSet(list);
		System.out.println(s);
		
	}

}
