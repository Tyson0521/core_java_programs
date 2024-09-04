package absraction;

public class B extends A{
	int j;
	public B (int i, int j) {
		super(i);
		this.j=j;
	}
	
	public void dontKnow() {
		System.out.println("From class B");
	}
}
