package Throwss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {
	
	//throws can only declare exceptions but cannot handle them
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path = "C:\\Users\\Jarupula\\OneDrive\\Desktop\\HTML Mock/program1.java";
		FileInputStream f = new FileInputStream(path);
		int i=f.read();
		while(i>0) {
			System.out.print((char)i);
			i=f.read();
		}
		System.out.println();
		System.out.println(10/0);
		System.out.println("The end.");
	}
}
