package StringPrograms;

public class DistinctCharOfString {
	
	public static void main(String[] args) {
		String s = "java";
		String s2 = "";
		
		//using nested for loop
		for(int i=0 ; i<s.length(); i++) {
			int count = 0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j) && i==j) {
					count++;
					break;
				}
				if(s.charAt(i)==s.charAt(j) && i>j) {
					break;
				}
			} 
			if(count==1) {
				s2+=s.charAt(i);
			}
		}	
		System.out.println(s2);
		
		//other nested method
		int[] occur = new int[s.length()];
		String temp ="";
		for(int i=0; i<s.length(); i++) {
			int count=1;
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					occur[j]=1;
				} 
			} 
			if(occur[i]!=1) {//for Duplicate elements (&& count>1) n For unique elements (&& count==1)
				temp = ""+s.charAt(i);
				System.out.print(temp);
			}
		}
		System.out.println();
		
		
		//using indexOf
		String s3="";
		for(int i=0 ; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i))>=s.indexOf(s.charAt(i),i)) {
				s3+=s.charAt(i);
			}
		} 
		System.out.println(s3);
		
	}
	

}
