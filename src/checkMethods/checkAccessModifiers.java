package checkMethods;

import methods.AccessModifiers;

class Demo{
	
	// PRIVATE SCOPE
	private static void d()
	{
		
	}
}
public class checkAccessModifiers extends AccessModifiers{

	public static void main(String[] args) {
		AccessModifiers.m1(); //PUBLIC: hence accessible from everywhere
//		AccessModifiers.m2(); //DEFAULT:  not accessible from other package
		AccessModifiers.m3(); //PROTECTED: accessible from different package only inside Child class , hence checkAccessModifiers extends AccessModifiers
//		Demo.d(); //PRIVATE: not accessible from other class
	}

}
