package oops;

class Chalk1{
	String brand;
	int length;
	String color;
}
public class Chalk {

	public static void main(String[] args) {
		 Chalk1 c1 = new Chalk1();
		 System.out.println(c1); //String generated Address of Memory allocated in Heap Block
		 
		 Chalk1 c2 = new Chalk1();
		 System.out.println(c2);
	}

}
