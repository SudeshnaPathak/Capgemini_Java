package methods;

public class VariableScope {
	static int a = 10;
	static int d = 30;
//	static boolean a = false; TWO GLOBAL SCOPE VARIABLES CANNOT HAVE SAME NAME
	static int b;
	
	public static void main(String[] args) {
		
 		int a = 20; //ONR LOCAL & ONE GLOBAL SCOPE VARIABLE CAN HAVE SAME NAME
 		
 		System.out.println(a); //O/P 20: LOCAL SCOPE IS PRIORITISED OVER GLOBAL SCOPE
 		System.out.println(d); //o/p 30: NOW GlOBAL SCOPE IS ACCESSED
 		
//		boolean a = true; //ERROR : TWO LOCAL SCOPE VARIABLES CANNOT HAVE SAME NAME
 		
 		System.out.println(b); //GLOBAL SCOPE STATIC VARIABLE CAN BE USED WITHOUT INITIALIZATION, AS COMPILER assumes default value
 		
 		int c;
// 		System.out.println(c); //LOCAL SCOPE VARIABLE CANNOT BE ACCESSED WITHOUT INITIALIZATION
 		
 		//default value
 		//byte , short , int , long -> 0
 		//float , double -> 0.0
 		//boolean -> false
 		//character -> ''
 		//All non primitive datatype -> null
	}

}
