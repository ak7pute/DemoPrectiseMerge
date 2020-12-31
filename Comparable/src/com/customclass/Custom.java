package com.customclass;

import java.util.Set;
import java.util.TreeSet;

public class Custom 
{
	public static void main(String[] args) {
		
		Set<Integer>s1=new TreeSet<>();
		s1.add(54);
		s1.add(6);
		s1.add(10);
		s1.add(20);
		s1.add(21);
		
		System.out.println(s1);
		
		Set<String>s2=new TreeSet<>();
		s2.add("akshay");
		s2.add("suraj");
		s2.add("Ganesh");
		s2.add("pratik");
		s2.add("Ganesh");
		
		System.out.println(s2);
		
	}

}
