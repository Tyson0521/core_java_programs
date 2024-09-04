package numberPrograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int i=0, j=1, k=300;
		fib(i, j, k);
	}
	
	public static void fib(int i, int j ,int k) {
		int a=i, b=j, d=k;
		int c=0;
		System.out.println(a);
		System.out.println(b);		
		while((a+b)<=d) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
