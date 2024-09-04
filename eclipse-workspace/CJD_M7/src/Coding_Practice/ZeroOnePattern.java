package Coding_Practice;

public class ZeroOnePattern {
	public static void main(String[] args) {
		int star=0, space = 4;
		for(int i=1;i<=4;i++) {
			space--;
			star++;
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if((i+j)%2!=0) {
					System.out.print("0 ");
				} else {
					System.out.print("1 ");
				}
			}
		System.out.println();
		}
	}
}
