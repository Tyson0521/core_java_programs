package numberPrograms;

public class AutoMorphicNumber {
	public static void main(String[] args) {
		int i = 25;
		if(checkAutoMorphic(i)) {
			System.out.println(i + " is Automorphic");
		} else {
			System.out.println(i + " is Not automorphic");
		}
	}
	
	public static boolean checkAutoMorphic(int i) {
		int square = i*i;
		boolean b = true;
		while(i!=0) {
			if(i%10 != square%10) {
				b=false;
				break;
			}
			i/=10;
			square/=10;
		}
		
		return b;
	}
}
