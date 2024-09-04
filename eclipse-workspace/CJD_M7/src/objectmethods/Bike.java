package objectmethods;

public class Bike {
	String bN;
	double tS;
	public Bike(String bN, double tS) {
		super();
		this.bN = bN;
		this.tS = tS;
	}
	
	public String toString() {
		return "Bike brandname: "+this.bN + " and topSpeed: "+this.tS;
	}
}
 