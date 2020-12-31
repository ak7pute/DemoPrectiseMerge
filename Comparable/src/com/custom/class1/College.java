package com.custom.class1;

import java.util.Set;
import java.util.TreeSet;

public class College 
{
	public static void main(String[] args)
	{
	Set<Student>s1=new TreeSet<>();
	
	Student s=new Student();
	s.setRollno(101);
	s.setName("abc");
	
	Student s2=new Student();
	s2.setName("xyz");
	s2.setRollno(102);
	
    Student s3=new Student();
    s3.setName("pqr");
    s3.setRollno(103);
    
    s1.add(s);
    s1.add(s2);
    s1.add(s3);
    
    for(Student stu:s1)
    {
    	System.out.println(stu.getName());
    	System.out.println(stu.getRollno());
    }
	}

}
