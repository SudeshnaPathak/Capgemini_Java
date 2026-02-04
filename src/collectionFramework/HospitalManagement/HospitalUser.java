package collectionFramework.HospitalManagement;
import java.io.Serializable;

public class HospitalUser implements Serializable{
	private String fullName;
	private String emailId;
	private long phoneNumber;
	private String address;
	private char gender;
	private int age;
	
	public HospitalUser(String fullName, String emailId, long phoneNumber, String address, char gender, int age) {
		this.fullName = fullName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "HospitalUser [fullName=" + fullName + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
