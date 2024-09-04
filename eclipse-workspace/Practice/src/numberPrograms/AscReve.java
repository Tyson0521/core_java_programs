package numberPrograms;

public class AscReve {
	public static void main(String[] args) {
		int n = 742987312;
		int num, rem, rev=0 ;
		for(int i=0; i<=9; i++) {
			num = n;
			while(num!=0) {
				rem = num%10;
				if(rem==i) {
					rev = rev*10+rem;
				}
				num/=10;
			}
		} 
		System.out.println(rev);
	}
}
