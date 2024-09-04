package vector;

public class Car {
	String brand;
	double tS;
	double mil;
	public Car(String brand, double tS, double mil) {
		super();
		this.brand = brand;
		this.tS = tS;
		this.mil = mil;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", tS=" + tS + ", mil=" + mil + "]\n";
	}
	
}
