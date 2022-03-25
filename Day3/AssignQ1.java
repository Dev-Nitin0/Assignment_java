package day3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssignQ1 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		try {
			try (FileInputStream fr = new 
				 FileInputStream("D:\\lectures\\Gate\\power system")) {
			}
		FileOutputStream fw = new FileOutputStream("D:\\lectures\\Gate\\power system");
		
			try (BufferedInputStream fr1 = new BufferedInputStream(new FileInputStream("D:\\lectures\\Gate\\power system"))) {
				try (BufferedOutputStream fw1 = new BufferedOutputStream(new FileOutputStream("D:\\lectures\\Gate\\power system"))) {
				}
				int i = 0;
				while ((i = fr1.read()) != -1) {
					fw.write(i);
}
			}
			fw.close();

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
}

     	long end = System.currentTimeMillis();

	System.out.println("time taken : " + (end - start) + " ms");
		
		try {
			FileReader fr1=new FileReader("D:\\lectures\\Gate\\power system");
			FileWriter fw1=new FileWriter("D:\\lectures\\Gate\\power system");
			int i=0;
			while((i=fr1.read())!=-1) {
				fw1.write(i);
			}
			fw1.close();
			fr1.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("file is written");
	}
}

