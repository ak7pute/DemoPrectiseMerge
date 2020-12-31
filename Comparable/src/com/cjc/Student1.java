package com.cjc;

public class Student1 implements Comparable<Student1>
{
	private int rollno;
	private int age;
	private String name;
	
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Student1 o) 
	{
		Student1 stu=(Student1)o;
	  return this.name.compareTo(stu.name);
	}
	
}	
