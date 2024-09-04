package access_specifier1;

public class P1 {
	protected static int i =10; 
	protected int j;  // can be used in same package and through import, inheritance,subclass instantiation only
	
	public P1 (int i) { //constructor cannot be inherited and it is only a supporting member
		this.j = i;
	}
	
	private int m1(int i) {
		System.out.println("from private method...");
		return i+10;
	}
	
	public int getM1(int i) {
		return m1(i);
	}
}
