package numberPrograms;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int i = 153;
		if(checkArmStrong(i)) {
			System.out.println(i+" is Armstong");
		} else {
			System.out.println(i+" is Not Armstrong");
		}
	
	}
	
	public static int count(int i) {
		int count = 0;
		while(i!=0) {
			i/=10;
			count++;
		}
		return count;
	}
	
	public static int power(int n, int m) {
		int r=1;
		for(int i=1;i<=m;i++) {
			r = r*n;
		}
		return r;
	}
	
	public static boolean checkArmStrong(int n) {
		int rem=0,sum=0, t=n;
		int power = count(n);
		while(n!=0) {
			rem = n%10;
			sum = sum + power(rem,power);
			n/=10;
		}
		return sum==t;
	}
}
