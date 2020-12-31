package com.cjc;

import java.util.Set;
import java.util.TreeSet;

public class College1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hiii");
		Set<Student1>s1=new TreeSet<>();
		
		Student1 stu1=new Student1();
		stu1.setAge(44);
		stu1.setRollno(101);
		stu1.setName("akshay");
		
		Student1 stu2=new Student1();
		stu2.setAge(36);
		stu2.setRollno(145);
		stu2.setName("swapnil");
		
		Student1 stu3=new Student1();
		stu3.setAge(45);
		stu3.setRollno(134);
		stu3.setName("shubham");
		
		s1.add(stu1);
		s1.add(stu2);
		s1.add(stu3);
		
		for(Student1 st:s1)
		{
			System.out.println(st.getAge());
			System.out.println(st.getRollno());
			System.out.println(st.getName());
		}
		
		
		
	}

}
