package methods;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		//byte = nextByte()
		//short = nextShort()
		//int = nextInt()
		//long = nextLong()
		//float = nextFloat()
		//double = nextDouble()
		//boolean = nextBoolean()
		//char = next().charAt(0)
		//string = next() -> for word, nextLine() -> for entire paragraph
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Character: ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		System.out.println(sc);
		sc.close();
	}

}
