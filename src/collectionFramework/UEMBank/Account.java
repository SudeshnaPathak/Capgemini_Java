package collectionFramework.UEMBank;

public abstract class Account {
	private String fullName;
	private String emailId;
	private long phoneNumber;
	private String address;
	
	
	public Account(String fullName, String emailId, long phoneNumber, String address) {
		this.fullName = fullName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
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
	
	public abstract boolean withdraw(double amount);
	public abstract void deposit(double ammount);
	public abstract void checkBalance();
	
	
}
