package Coding_Practice;

public class NumP3 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		star();
	}
	public static void star() {
		int st=-1, sp=4;
		char ch='a';
		int n=1;
		for(int i=1;i<=7;i++) {
			if(i<=4) {
				st+=2;
				sp--;
			} else {
				st-=2;
				sp++;
			}
			for(int k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++){
				if(i%2==0)
					System.out.print(n++);
				else 
					System.out.print(ch++);
			}
		System.out.println();
		}
	}
}
