package oops.abstraction.whatsapp;

import oops.abstraction.Whatsapp;

public class UseWhatsapp implements Whatsapp{
	
	public void payments()
	{
		System.out.println("Make Payment");
	}
	
	public void chat()
	{
		System.out.println("Chat with other users");
	}
	
	public void status()
	{
		System.out.println("Add Status");
	}
	
	public void newChat()
	{
		System.out.println("Create New Chat");
	}
	
	public void groups()
	{
		System.out.println("Create Group");
	}
	
	//Override default bank method
	public void bank()
	{
		System.out.println("Link to Bank");
	}
}
