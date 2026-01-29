package oops.encapsulation;

class Student{
	//DATA HIDING
	private String name;
	private int rollNumber;
	private char section;
	
	public Student(String name, int rollNumber, char section) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.section = section;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", section=" + section + "]";
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Student s1 = new Student("Sudeshna" , 22 , 'A');
		Student s2 = new Student("Projita" , 44 , 'B');
		Student s3 = new Student("Shreya" , 66 , 'C');
		System.out.println(s1.getRollNumber());
		System.out.println(s1);
	}

}
