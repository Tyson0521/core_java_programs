package Coding_Practice;

public class NumP1 {
	public static void main(String[] args) {
		int star=4;
		for(int i=1;i<=4;i++) {
			int n=1;
			if(i==2) {
				n++;
			} else if(i==3) {
				n+=2;
			} else if(i==4) {
				n+=3;
			}
			for(int j=1;j<=star;j++) {
				if(n==5) {
					n=1;
					System.out.print(n++);
				} else {
					System.out.print(n++);
				}
			}
		System.out.println();
		}
	}
}
