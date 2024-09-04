package lambdaExpression;

public class ReverseUserLogic {
	public static void main(String[] args) {
		Reverse r = (int i)->{
			int rev = 0;
			while(i!=0) {
				int rem = i%10;
				rev = rev*10 + rem;
				i/=10;
			}
			System.out.println(rev);
		}; 
		r.reverse(35);
	}
}
