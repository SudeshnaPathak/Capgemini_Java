package objectClass;

public class Employee {
	
	private static int id = 0;
	private String name;
	private int employeeId;
	private String bloodGroup;
	private String companyName;
	
	
	public Employee(String name, String bloodGroup, String companyName) {
		this.name = name;
		this.employeeId = ++id;
		this.bloodGroup = bloodGroup;
		this.companyName = companyName;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", bloodGroup=" + bloodGroup + ", companyName="
				+ companyName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return this.employeeId == e.employeeId;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + this.companyName.hashCode() + this.bloodGroup.hashCode() + this.name.hashCode() + this.employeeId;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Sudeshna" , "A+" , "Capgemini");
		Employee e2 = new Employee("Sudeshna" , "A+" , "Capgemini");
		Employee e3 = new Employee("Projita" , "B+" , "Capgemini");
		Employee e4 = e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() == e2.hashCode());
		System.out.println(e1.equals(e3));
		System.out.println(e1.hashCode() == e3.hashCode());
		System.out.println(e1.equals(e4));
		System.out.println(e1.hashCode() == e4.hashCode());
		System.out.println(e4);
	}

}
