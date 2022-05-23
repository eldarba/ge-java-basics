package f.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTestFile2 {

	public static void main(String[] args) {
		
		File dir = new File("files");
		File file = new File(dir, "letter.txt");
		
		
		try(BufferedReader in = new BufferedReader(new FileReader(file));) {
			String line = in.readLine();
			while(line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
