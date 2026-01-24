package methods;

class Calculator{
	
	//WE CAN OVERLOAD MAIN METHOD AS WELL
	//Different datatype of formal arguments
	public static void main(double num) {
		System.out.println("Main 1");
	}
	public static void main(int b) {
		System.out.println("Main 2");
	}
	
	//Different length of formal arguments
	//Different access modifiers
	//Different return type
	public static void add(double num1 , double num2)
	{
		System.out.println(num1 + num2);
	}
	protected void add(double num1 , double num2 , double num3)
	{
		System.out.println(num1 + num2 + num3);
	}
	
	static void add(double num1 , double num2 , double num3 , double num4)
	{
		System.out.println(num1 + num2 + num3 + num4);
	}
	
	public static double add(double num1 , double num2 , double num3 , double num4 , double num5)
	{
		return num1 + num2 + num3 + num4 + num5;
	}
	
	//Different order of formal arguments
	public static void add(int a , boolean b) {}
	public static void add(boolean a , int b) {}
	
}
public class MethodOverloading {
	
    //JVM considers MAIN method with String[] args as formal argument in case of MAIN Method overloading
	public static void main(int a)  // Executes without static and formal arguments in case of JDK 25
	{
		System.out.println(Calculator.add(10 , 20 , 30 , 40 , 50));
		
	}
	
	//WITHOUT String[] args , the main method w/o arguments is given preference , O/P : Main 3
	public void main() {
		System.out.println("Main 3");
	}

}
