package Collection;

public class Bike implements Comparable<Bike>{
	String brand;
	double price;
	double speed;
	double milage;
	
	public Bike(String brand, double price, double speed, double milage) {
		super();
		this.brand = brand;
		this.price = price; 
		this.speed = speed;
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", speed=" + speed + ", milage=" + milage + "]\n";
	}
	
	
	//comparing strings by using compareTo() present in String class
//	public int compareTo(Bike b) {
//		return this.brand.compareTo(b.brand);
////		return b.brand.compareTo(this.brand); 		//to arrange in desending order 
//	}
	
	
	public int compareTo(Bike b) {
		if(this.price>b.price) {
			return 1; 		//-ve value for descending order
		} else if(this.price<b.price) {
			return -1;  	//+ve value for descending order
		}
		return 0;
	}
	
}
