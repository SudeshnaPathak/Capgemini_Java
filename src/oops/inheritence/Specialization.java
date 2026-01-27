package oops.inheritence;

class Par{
	int a;
}

class Chld extends Par{
	int b;
}
public class Specialization {

	public static void main(String[] args) {
		
		Par p = new Chld();
		System.out.println(p.a);
//		System.out.println(p.b); //COMPILE TIME ERROR --> Object reference variable is of Parent Type, Parent type reference cannot access child class property
		
		Chld c = (Chld)p;
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
