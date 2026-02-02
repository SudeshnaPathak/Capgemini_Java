package objectClass;

class Student{
	
	String name;
	double marks;
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	//Checks properties
	@Override
	public boolean equals(Object obj) //up-casting
	{
		Student s = (Student)obj;//down-casting
		return this.marks == s.marks && this.name == s.name;
	}
	
	//Checks address + properties
	@Override
	public int hashCode() {
		//super.hashCode() returns unique integer value of calling object address/reference
		return super.hashCode() + this.name.hashCode() + (int)this.marks;
	}
	
}
public class ObjectClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ramesh" , 97.8);
		Student s2 = new Student("Ramesh" , 97.8);
		Student s3 = new Student("Mukesh" , 79.25);
		Student s4 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2) ? "Same" : "Not Same");
		System.out.println(s1.hashCode() == s2.hashCode() ? "Same" : "Not Same");
		System.out.println(s1.hashCode() == s4.hashCode() ? "Same" : "Not Same");
		s4.name = "Sudeshna";
		System.out.println(s1.hashCode() == s4.hashCode() ? "Same" : "Not Same");
	}

}
