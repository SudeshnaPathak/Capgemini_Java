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
	
	@Override
	public boolean equals(Object obj) //up-casting
	{
		Student s = (Student)obj;//down-casting
		return this.marks == s.marks;
	}
	
}
public class ObjectClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ramesh" , 97.8);
		Student s2 = new Student("Suresh" , 97.8);
		Student s3 = new Student("Mukesh" , 79.25);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2) ? "Same" : "Not Same");
	}

}
