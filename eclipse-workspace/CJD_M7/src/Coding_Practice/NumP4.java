package Coding_Practice;

public class NumP4 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		star();
	}

	public static void star() {
		int st=-1, sp=4; 
		for(int i=1;i<=7;i++) {
			int n=1;
			if(i<=4){
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
				if(j<i) {
					System.out.print(n);
					n+=3;
				} else {
					System.out.print(n);
					n-=3;
				}
			}
		System.out.println();
		}
	}
}
