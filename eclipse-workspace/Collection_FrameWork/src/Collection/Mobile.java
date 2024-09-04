package Collection;

public class Mobile implements Comparable<Mobile>{
	String brand;
	double price;
	int ram;
	int storage;
	public Mobile(String brand, double price, int ram, int storage) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", ram=" + ram + ", storage=" + storage + "]\n";
	}
	
	@Override
//	public int compareTo(Mobile o) {
//		if(this.storage>o.storage) {
//			return -1;
//		}
//		else if(this.storage<o.storage) {
//			return 1;
//		}
//		return 0;
//	}
	
	public int compareTo(Mobile o) {
		if(this.price>o.price) {
			return -1;
		}
		else if(this.price<o.price) {
			return 1;
		}
		return 0;
	}
	
	
}
