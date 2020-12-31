package custom;

import java.util.Set;
import java.util.TreeSet;

public class Company 
{
	public static void main(String[] args) {
		Set<Emplyoyee>setemp=new TreeSet<>();
		
		Emplyoyee employee1=new Emplyoyee();
		employee1.setEmpid(101);
		employee1.setName("Pritam");
		employee1.setAge(22);
		
		Emplyoyee emplyoyee2=new Emplyoyee();
		emplyoyee2.setEmpid(102);
		emplyoyee2.setName("Ganesh");
		emplyoyee2.setAge(23);
		
		Emplyoyee emplyoyee3=new Emplyoyee();
		emplyoyee3.setAge(24);
		emplyoyee3.setEmpid(104);
		emplyoyee3.setName("Bhau");
		
		setemp.add(employee1);
		setemp.add(emplyoyee2);
		setemp.add(emplyoyee3);
		
		for(Emplyoyee emp:setemp)
		{
			System.out.println(emp.getAge());
			System.out.println(emp.getEmpid());
			System.out.println(emp.getName());
		}
	}

}
