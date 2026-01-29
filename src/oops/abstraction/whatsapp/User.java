package oops.abstraction.whatsapp;

import oops.abstraction.Whatsapp;

public class User extends UseWhatsapp{
	
	String userName;
	long phoneNumber;
	
	User()
	{
		this("Unknown User" , 1234567890l);
	}
	
	User(String userName)
	{
		this(userName , 1234567890l);
	}
	
	User(long phoneNumber)
	{
		this("Unknown User" , phoneNumber);
	}
	
	User(String userName , long phoneNumber)
	{
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}
	
	public static void main(String[] args) {
		User u = new User("Sudeshna Pathak" , 8825250158l);
		u.bank();
		u.chat();
		u.groups();
		u.newChat();
		u.status();
		u.payments();
        //u.archive(); static methods of Whatsapp interface are not inherited
		Whatsapp.archive();
	}

}
