package oops.inheritence;

class Prt{
	
}

class Cld extends Prt{
	
}

public class NonPrimitiveTypeCasting {

	public static void main(String[] args) {
		
		//All Non Primitive dataType have 2 bytes capacity
		System.out.println("Main Starts");
		Cld c = new Cld(); //normal object creation
		
		Prt p = new Cld(); //up-casting(IMPLICIT)
		Prt p1 = (Prt)new Cld(); //up-casting(EXPLICIT) ---> not recommended
		
		//In Java Parent type object cannot be stored in Class Type Object.
        //Cld c = (Cld)new Prt(); //ClassCastException(Although compiler doesn't complain) ---> Contradicts Run Time Polymorphism which uses up-casting
		
		//We cannot achieve down-casting w/o up-casting
		Cld c1 = (Cld)p; //down-casting ---> Always done EXPLICITLY
		
		Prt p2 = new Prt();
        //Cld c2 = (Cld)p2; ---> ClassCastException
		
		System.out.println(p2 instanceof Cld);
		System.out.println(p2 instanceof Prt);
		System.out.println(p instanceof Prt);
		System.out.println(p instanceof Cld);
		System.out.println(c instanceof Prt);
		System.out.println(c instanceof Cld);
		
		//AVOID ClassCastException using instanceof operators
		Cld cd = null;
		if(p2 instanceof Cld)
		{
			cd = (Cld)p2;
			System.out.println("Down Casting");
		}
		System.out.println("Main Ends");
	}

}
