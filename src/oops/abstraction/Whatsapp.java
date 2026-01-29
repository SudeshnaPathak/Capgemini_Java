package oops.abstraction;

public interface Whatsapp {
	//public abstract non static methods
	void payments();
	void chat();
	void status();
	void newChat();
	void groups();
	
	//NOT 100% ABSTRACTION ---> FROM Java 8
	//1. public default non static methods allowed
	default void bank(){}
	
	//2. private static methods allowed
	private static void helper()
	{
		System.out.println("archived");
	}
	//3. public static methods allowed --> but cannot be inherited
	static void archive()
	{
		helper();
	}
}
