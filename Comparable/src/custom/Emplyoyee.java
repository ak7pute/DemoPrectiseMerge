package custom;

public class Emplyoyee implements Comparable<Emplyoyee>
{
	private int Empid;
	private String Name;
	private int Age;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int compareTo(Emplyoyee o)
	{
		Emplyoyee emp=(Emplyoyee)o;
		return this.Age-emp.Age;
	}

}
