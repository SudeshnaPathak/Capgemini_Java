package oops.libraryManagement;

public class Librarian {
	private String name;
	private int age;
	private char gender;
	private int id;
	
	public Librarian(String name, int age, char gender, int id) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Librarian [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + "]";
	}
	
}
