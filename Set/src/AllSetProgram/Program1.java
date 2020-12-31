package AllSetProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program1 
{
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(15);
		list.add(25);
		list.add(15);
		list.add(14);
		list.add(18);
		
		System.out.println(list);
		
		Set set=new HashSet(list);
		System.out.println(set);
		
		
	}

}
