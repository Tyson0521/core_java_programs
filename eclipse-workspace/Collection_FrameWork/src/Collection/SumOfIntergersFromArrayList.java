package Collection;

import java.util.ArrayList;

public class SumOfIntergersFromArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(25);
		al.add(51);
		al.add(21);
		al.add("hi");
		System.out.println(al);
		int sum = 0;		
		for(int i=0; i<al.size();i++) {
			if(al.get(i) instanceof Integer) {
				Integer j = (Integer)al.get(i);
				sum = sum + j;
			}
		}
		System.out.println("Sum of Intergers present in ArrayList is : "+sum);
		
		
	}
}
