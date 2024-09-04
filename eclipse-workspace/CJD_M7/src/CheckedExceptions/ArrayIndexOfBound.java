package CheckedExceptions;

public class ArrayIndexOfBound {
	public static void main(String[] args) {
		int[] a = {0,4,5,6,7,3,4,2,4,2};
		
		try {
			System.out.println("Yoo");
			System.out.println(a[5]);
			System.out.println(a[20]);
			System.out.println("bye");
		} 
		catch (ArrayIndexOutOfBoundsException aioob) {
			System.out.println("AIOOBE handled..");
		}
		System.out.println(">>>>>The end<<<<<");
	}
}
