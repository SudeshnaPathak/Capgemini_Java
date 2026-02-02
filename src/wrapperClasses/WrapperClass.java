package wrapperClasses;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 10;
		Integer i = Integer.valueOf(a); //BOXING
		System.out.println(i);
		
		Integer j = a;
		System.out.println(j); //AUTO BOXING, Since java 1.5 onwards
		
		int b = j.intValue(); //UNBOXING
		System.out.println(b);
		
		int c = j; //AUTO UNBOXING
		System.out.println(c);
		
		String s = "123";
		int d = Integer.parseInt(s); //Parsing: Converting non primitive to primitive
		System.out.println(d);
		
//		String s1 = "123 "; //NumberFormatException
//		int d1 = Integer.parseInt(s1); //Extra Space
//		System.out.println(d1);
		
	}

}
