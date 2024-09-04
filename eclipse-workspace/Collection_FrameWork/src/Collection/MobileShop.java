package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class MobileShop {
	public static void main(String[] args) {
		ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
		mobiles.add(new Mobile("Oneplus", 35000, 12, 256));
		mobiles.add(new Mobile("Iphone", 85000, 6, 256));
		mobiles.add(new Mobile("Redmi", 18000, 8, 128));
		mobiles.add(new Mobile("Samsung", 55000, 8, 64));
		mobiles.add(new Mobile("Google", 95000, 12, 512));
		
		Collections.sort(mobiles);
		System.out.println(mobiles);
		
		System.out.println("The second costliest mobile is : ");
		System.out.println(mobiles.get(1));
		
		ArrayList<Mobile> storage = new ArrayList<Mobile>();
		for(int i=0; i<mobiles.size();i++) {
			if(mobiles.get(i).storage>100) {
				storage.add(mobiles.get(i));
			}
		}
		System.out.println("Mobiles with more than 100gb Storage : ");
		System.out.println(storage);
		
		
		System.out.println("Mobiles starting with Consonants :");
		String vowels = "AEIOUaeiou";
		for(Mobile m : mobiles) {
			if(!vowels.contains(m.brand.charAt(0)+"")) {
				System.out.println(m);
			}
		}
	} 
	
}
