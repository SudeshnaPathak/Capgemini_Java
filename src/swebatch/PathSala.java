package swebatch;

public class PathSala {

	public static void main(String[] args) {
		int a = 10;
		byte b = 20;
		char ch = 'A';
		boolean bool = true;
		System.out.println(a);
		System.out.println(b);
	    System.out.println(ch);
	    System.out.println(bool);
	    
	    char c = 20; //ASCII
	    System.out.println(c);
	    
	    // WIDENING/IMPLICIT --> NO RISK OF DATA LOSS
	    byte b1 = 30;
	    short s = (short)b1; //EXPLICITLY
	    int i = b1; //IMPLICITLY
	    System.out.println(s);
	    System.out.println(i);
	    
	    //NARROWING/EXPLICIT --> Data Loss
	    int x = 1089687;
	    short s1 = (short)x; // Data Loss outside range of short
	    System.out.println(s1);
	    
	    int z = 'a';
	    System.out.println(z);
	    char y = 75; //ASCII
	    System.out.println(y);
	    System.out.println((char)75);
	    
	    float f1= 10.56f;
	    long l = (long)f1; //EXPLICIT : Although float:8 bytes, long:8 bytes, there is a risk of data loss as float stores decimal & long stores whole numbers
	    System.out.println(l);
	    
	    long h = 35886789l;
	    float f3 = h;
	    System.out.println(f3);
	    
	    char m = 75; //CHAR : No concept of Sign bit , 16 bits reserved for data
	    short n = (short)m; //SHORT : 1st bit Reserved Sign bit , 15 bits left for data, therefore 1 bit data loss , Hence EXPLICIT
	    System.out.println(n);
	    
	    int i2 = 10;
	    i2 += 20; //COMPOUND ASSIGNMENT
	    i2 -= 10;
	    i2 %= 20;
	    System.out.println(i2);
	    
	    //RELATIONAL OPERATOR
	    System.out.println(10 > 5);
	    
	    //SHORT CICUITING
	    System.out.println(10 <= 5 && 0 > 9);
	    System.out.println(10 >= 5 || 0 > 9);
	    
	    //TERNARY OPERATOR
	    System.out.println( 18 >= 18 ? "Eligible" : "Not Eligible");
	    System.out.println( 17 >= 18 ? "Eligible" : "Not Eligible");
	    
	}
	
}
