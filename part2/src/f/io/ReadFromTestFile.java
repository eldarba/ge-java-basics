package f.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTestFile {

	public static void main(String[] args) {
		
		File dir = new File("files");
		File file = new File(dir, "letter.txt");
		
		System.out.println(file.exists());
		
		try(FileReader in = new FileReader(file);) {
			int c = in.read();
			System.out.println(c + " - " + (char)c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
