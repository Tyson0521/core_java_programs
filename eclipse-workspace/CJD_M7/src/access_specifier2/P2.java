package access_specifier2;

import access_specifier1.P1;

public class P2 extends P1 {
	
	public P2(int i) {
		super(i);
		
	}

	public static void main(String[] args) {
		P2 obj = new P2(41);
		System.out.println(P1.i);
		System.out.println(obj.j);
		System.out.println(obj.getM1(9));
		
		
	}

}