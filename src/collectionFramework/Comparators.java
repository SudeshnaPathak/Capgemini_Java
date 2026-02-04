package collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

//Using Comparable we can compare only on the basis of one property
class Student{
	// implements Comparable<Student>
	private String name;
	private int rollNumber;
	private char section;
	Student(String name , int rollNumber , char section)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.section = section;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
	
//	@Override
//	public int compareTo(Student o) {
////		return this.name.compareTo(o.name); //ascending
////		return o.name.compareTo(this.name); //descending
//		return this.rollNumber - o.rollNumber;
//	}
	
}

class CompareRollNumber implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNumber() - o2.getRollNumber();
	}
}

class CompareSection implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSection() - o2.getSection();
	}
}

class CompareName implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}	
}

public class Comparators {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Rohan" , 3 , 'A'));
		studentList.add(new Student("Ramesh" , 1 , 'B'));
		studentList.add(new Student("Suresh" , 2 , 'C'));
		studentList.add(new Student("Nishit" , 5 , 'A'));
		studentList.add(new Student("Mukesh" , 4 , 'B'));
		
		System.out.println(studentList);
//		Collections.sort(studentList); --->Calls Comparable<Student>
		
		studentList.sort(new CompareName()); //----> Calls Comparator<Student>
		System.out.println(studentList);
		
		studentList.sort(new CompareRollNumber());
		System.out.println(studentList);
		
		studentList.sort(new CompareSection());
		System.out.println(studentList);
		
		System.out.println("-----------------");
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----------------");
		ListIterator<Student> l = studentList.listIterator(5);
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
		System.out.println("-----------------");
		ListIterator<Student> l1 = studentList.listIterator(2);
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
	}

}
