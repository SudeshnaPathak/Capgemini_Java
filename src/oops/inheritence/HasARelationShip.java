package oops.inheritence;

class TravelAgency{
	String bus;
	String car;
	String truck;
}

class Trip{
	//non-static single line initializer & ta is non static variable
	TravelAgency ta = new TravelAgency();
}

//LOOSE COUPLING : As the Child class is not inheriting all the properties of the parent class, it only uses/accesses the properties which it needs
//HasARelationShip : Scanner Class
public class HasARelationShip {

	public static void main(String[] args) {
		Trip t = new Trip();
		t.ta.bus = "Traveller Bus";
		System.out.println(t.ta.bus);
	}

}
