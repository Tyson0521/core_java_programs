package KPrograms;

public class UserLogic {
	//to count the number of objects created in multi-level inheritance
	
	public static void main(String[] args) {
		D obj = new D();
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		C obj4 = new C(); 
		System.out.println(obj.count);
	}

}
