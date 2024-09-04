package Coding_Practice;

public class NumP2 {
	public static void main(String[] args) {
		int star=2, space = 5;
		for(int i=1;i<=5;i++) {
			int n=1;
			int n1=3;
			
//			if(i<=3) {
//				star++;
//			} else {
//				star--;
//			}
			
			if(i==1) {
				star--;
				space-=2;
			} else if(i==5) {
				star--;
				space+=2;
			} else {
				star=2;
				space=1;
			}
			
			for(int j=1;j<=star;j++) {
				System.out.print(n++);
			}
			for(int k=1;k<=space;k++) {
				if(i==3 && k==1) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=star;j++) {
				System.out.print(--n1);
			}	
		System.out.println();
		}
		
	}
}
