package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product{
	double price;
	String name;
}
public class ListInterface {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(22);
		al.add(36);
		
		System.out.println(al);
		al.sort(null);
		System.out.println(al);
		al.sort((a , b) -> b - a);
		System.out.println(al);
		al.set(1, 25);
		
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		System.out.println(al.contains(22));
		
		ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
		li.add(new ArrayList<>(List.of(10 , 20 , 30)));
		
		Integer arr[] = {10 , 22 , 33};
		li.add(new ArrayList<>(Arrays.asList(arr)));
		
		System.out.println(li);
		
		li.sort((a , b) -> b.get(0) - a.get(0)); 
		System.out.println(li);
		
		li.sort((a , b) -> {
			for(int i = 0 ; i < 3 ; i++)
			{
				if(a.get(i) != b.get(i)) return b.get(i) - a.get(i);
			}
			return 0;
		});
		
		System.out.println(li);
		
//		li.forEach(row -> row.sort(Collections.reverseOrder()));
		li.forEach(row -> row.sort((a , b) -> b-a));

		System.out.println(li);
		
		for(ArrayList<Integer> i : li) System.out.println(i);
	}

}
