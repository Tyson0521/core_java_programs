package objectmethods;

public class BikeEquals {
	String bN;
	double tS;
	public BikeEquals(String bN, double tS) {
		super();
		this.bN = bN;
		this.tS = tS;
	} 
	
	public boolean equals(Object obj) {
			if (obj instanceof BikeEquals) {
				return this.bN==((BikeEquals)obj).bN && this.tS==((BikeEquals)obj).tS ;
			} else {
				return this.bN==((CarEquals)obj).bN && this.tS==((CarEquals)obj).tS ;
			}
	}
}

