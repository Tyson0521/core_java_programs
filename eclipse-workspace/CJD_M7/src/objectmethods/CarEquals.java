package objectmethods;

public class CarEquals {
	String bN;
	double tS;
	public CarEquals(String bN, double tS) {
		super();
		this.bN = bN;
		this.tS = tS;
	}  
	
	public boolean equals(Object obj) {
		if(obj instanceof CarEquals) {
			return this.bN==((CarEquals)obj).bN && this.tS==((CarEquals)obj).tS;
		} else {
			return this.bN==((BikeEquals)obj).bN && this.tS==((BikeEquals)obj).tS;
		}
	}

}

