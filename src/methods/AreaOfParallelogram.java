package methods;

public class AreaOfParallelogram {
	
	//PRIMITIVE RETURN TYPE
	public static double area(double b , double h)
	{
		return b * h;
	}
	
	//VOID RETURN TYPE
	public static void demo(byte a , byte b) //FORMAL ARGUMENTS/PARAMETERS
	{
		System.out.println("Sum:" + (a+b));
	}
	
	public static void demo1(int a , boolean b)
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		System.out.println("Area of Parallelogram: " + area(10.8 , 2.4)); //ACTUAL ARGUMENTS/REAL VALUES
		byte a = 3; //DEFAULT TYPE INT , BUT ASSIGNMENT OPERATOR SPECIFIES IT IS BYTE TYPE , DUE TO BEHAVIOR OF ASSIGNMENT OPERATOR
		byte b = 4;
		demo(a , b); 
//		demo(3 , 4); //ERROR : COMPILER FAILS TO UNDERSTAND IMPLICITLY THAT THE DEFAULT INT TYPE IS BEING TREATED AS BYTE HERE
		
		
		byte c = 10; 
		byte d = 30;
//		byte e = c + 40; //ERROR : BYTE + INT = INT , BEHAVIOR OF ASSIGNMENT OPERATOR
		
		//byte + byte = int
		//short + byte = int
		//short + int = int
		//short + short = int
		//int + byte = int
		//int + int = int
		//int + long = long
		
		demo1(10 , true); //ORDER OF FORMAL AND ACTUAL ARGUMENT SHOULD BE SAME
	}

}
