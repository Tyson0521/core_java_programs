package lambdaExpression;

public class UserLogicLamdaExprn {
	public static void main(String[] args) {
//		LambdaExprn e = (int i)->{
//			System.out.println("The i value passed is: "+i);
//		};
//		e.add(25);
		
//		LambdaExprn e2 = ()->{
//			System.out.println("vijay is sleeping");
//			System.out.println("wake up bro");
//		};
//		e2.sleep();
		
		LambdaExprn e3 = (i,j)->{
			return i+j;
		};
		System.out.println(e3.add(35, 15));
		
		LambdaExprn e4 = (i,j)->i+j;
		System.out.println(e4.add(30, 10));
		
	}
}
