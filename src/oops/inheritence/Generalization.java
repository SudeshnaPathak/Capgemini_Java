package oops.inheritence;

class RelianceDigital{
	
}

class Laptops extends RelianceDigital{
	
}

class Mobiles extends RelianceDigital{
	
}

class WashingMachines extends RelianceDigital{
	
}

class Fridge extends RelianceDigital{
	
}

class TV extends RelianceDigital{
	
}

class Fan extends RelianceDigital{
	
}

class Hometheatre extends RelianceDigital{
	
}
public class Generalization {

	public static void main(String[] args) {
		//Generalized object of RelianceDigital to store every other object
		//We perform up-casting to achieve Generalization
		RelianceDigital rd = new Laptops();
		RelianceDigital rd1 = new Hometheatre();
	}

}
