package objectmethods;

public class DriverEquals {
	public static void main(String[] args) {
		CarEquals car1 = new CarEquals("tata",230.87);
		CarEquals car2 = new CarEquals("tata",230.87);
		CarEquals car3 = new CarEquals("Toyata",222.87);
		
		BikeEquals bike1 = new BikeEquals("yamaha",186.54);
		BikeEquals bike2 = new BikeEquals("yamaha Xsr",111.54);
		
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));
//		System.out.println(car1.equals(bike2));
//		System.out.println(bike1.equals(car2));
		System.out.println(bike1.equals(bike2));
	}
}
