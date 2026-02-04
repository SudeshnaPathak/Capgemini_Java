package fileHandling;

import java.io.*;
import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Sudeshna Pathak\\eclipse-workspace\\Capgemini_Java\\src\\fileHandling\\files\\My-first-file.txt");
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		try {
			if(file.createNewFile())
				{
					System.out.println("File Created");
				}
			else
				{
					System.out.println("File Already Present");
				}
			
			//////WRITE//////
			fileWriter = new FileWriter(file);
			//Data is written in main file only after we close the connection in finally
			fileWriter.write("This is my first sentence \n");
			fileWriter.append("2nd Sentence");
			System.out.println("Written Successfully");
			
			////////READ////////
//			fileWriter.flush(); //closes connection 
//			fileWriter.write("flushed"); //Not written bcoz connection is closed
//			fileReader = new FileReader(file);
//			int ascii;
//			while((ascii = fileReader.read()) != -1)
//			{
//				System.out.print((char)ascii);
//			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
				try {
					fileWriter.close(); //fileWriter can be null hence throws IOException
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		try {
			fileReader = new FileReader(file);
			int ascii;
			while((ascii = fileReader.read()) != -1)
			{
				System.out.print((char)ascii);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	}

}
