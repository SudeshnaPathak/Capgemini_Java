package methods;

class Demo{
	public static void m(float a) {
		System.out.println("From float");
	}
	
	public static void m(double d) {
		System.out.println("From double");
	}
	
	public static void m(short s) {
		System.out.println("From short");
	}
}
public class MethodBinding {

	public static void main(String[] args) {
		 
		Demo.m(10); // From float
		Demo.m((short)10);
	}
	
	//Smallest to largest
	//byte -> short -> int -> long -> float -> double
	//char -> int
	
	//if int unavailable then it looks for long -> float -> double
	//if desired type is unavailable , compiler will always go for higher order based on the above chart , but in order of FCFS
	//if double is also not found : COMPILE TIME ERROR

}
