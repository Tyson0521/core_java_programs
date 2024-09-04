package UnCheckedExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FNFException {
	public static void main(String[] args) {
		String path = "C:\\Users\\Jarupula\\OneDrive\\Desktop\\HTML Mock/program1.java";
		String content = "Hello this is example for File creation and writing as well as reading through eclipse.";
		byte[] a = content.getBytes();
		
		//to create a file and write some content
		try {
			FileOutputStream fout = new FileOutputStream(path);
			System.out.println("File created Successfully......");
			fout.write(a);
			System.out.println("content send Successfully......");
		}
		catch(FileNotFoundException ae) {
			System.out.println("Coundln't Connect to the file !!");
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Counldn't Read the file !!");
		}
		
		
		//to connect to existing or newly created file and read the content in it by read()
		try {
			FileInputStream finput = new FileInputStream(path);
			int msg = finput.read();
			while(msg>0) {
				System.out.print((char)msg);
				msg = finput.read();
			}
			System.out.println();
			System.out.println("Data fecthed Successfully.....");
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Unsuccessfull in creating the file !! ");
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Counldn't Read the file !!");
		}
		
		
		//mkdir()
		File f = new File(path);
		boolean b = f.mkdir();
		if(b) {
			System.out.println("File Created.....");
		} else {
			System.out.println("File not Created !!!");
		}
		
		
		
		
	}
}
