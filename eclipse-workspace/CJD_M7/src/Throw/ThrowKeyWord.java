package Throw;

public class ThrowKeyWord {
	public static void main(String[] args) {
		int girlAge = 20;
		
		if(girlAge<=20) {
			try {
				throw new MarriageException("Macha Wait for Few Years !!!!");
			}
			catch(MarriageException e) {
				System.out.println(e.getMessage());
			} 
		} else {
			System.out.println(">>>>>>>Happy Married life macha<<<<<<<");
		}
			
	}
}
