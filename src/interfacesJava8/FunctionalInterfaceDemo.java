package interfacesJava8;

interface FunctionalInterface{
	//only one abstract method
	void demo(int a);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		FunctionalInterface f = (int a) -> {
			System.out.println("Body from functional interface");
		};
		f.demo(0);
	}

}
