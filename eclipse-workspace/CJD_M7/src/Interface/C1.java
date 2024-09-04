package Interface;

abstract public class C1 implements P1,P2 {
	public void run () {
		System.out.println("from run() of C1.");
		System.out.println(P1.i);
	}
	
	public void hello() {
		System.out.println("From hello of C1");
	}
	
	public void vijay(String s) {
		System.out.println(s);
	} 
	
	
	abstract public void abstractmethod();
}
