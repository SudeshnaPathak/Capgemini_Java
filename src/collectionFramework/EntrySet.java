package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class EntrySet {

	public static void main(String[] args) {
		HashMap<Integer , String> m = new HashMap<Integer , String>();
		m.put(1, "Aman");
		m.put(7, "Mohan");
		m.put(12, "Soham");
		m.put(21, "Suresh");
		m.put(10 , "Rahul");
		
		for(Map.Entry<Integer , String> e : m.entrySet())
		{
			System.out.println(e);
		}
	}

}
