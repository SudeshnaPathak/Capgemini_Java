package collectionFramework.HospitalManagement;

import java.io.File;
import java.io.*;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import collectionFramework.UEMBank.Bank;

public class Hospital {
	private static int id = 0;
	private static long accNumber;
	static HashMap<Integer , HospitalUser> users = new HashMap<>();
	
	public static void setAccNumber(long accNumber) {
		Hospital.accNumber = accNumber;
	}
	
	public static int admission(HospitalUser user)
	{
		users.put(++id , user);
		System.out.println("Your User Id: "+ id);
		storeUserInFile(user);
		return id;
	}
	
	public static void storeUserInFile(HospitalUser user)
	{
		File file = new File("C:\\Users\\Sudeshna Pathak\\eclipse-workspace\\Capgemini_Java\\src\\fileHandling\\files\\Hospital.txt");
		try(ObjectOutputStream vehicleObjectOutput
                = new ObjectOutputStream(
                        new FileOutputStream(file)))
		{
			vehicleObjectOutput.writeObject(users.toString());
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void payment(int userId , long accountNumber , double ammount)
	{
		if(users.containsKey(userId))
		Bank.MoneyTransfer(accNumber , accountNumber , ammount);
		else System.out.println("User doesn't exist");
	}
}
