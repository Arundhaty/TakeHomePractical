package Homework;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileExistsOrNot {
	
     static String Path  = "C:\\Users\\Admin\\Takehome\\Takehome\\Fruit\\Dictionary.txt";
     
	public static void main(String[] args) throws IOException{ 
		
	 doesFileExists(Path);
	 
	}
	
	public static String doesFileExists(String path)throws IOException {
			
			String line = null;
			
			try {
				File f = new File(Path);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				while ((line = br.readLine()) != null ) {
					System.out.println(line);
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("File does not exists");
			}
			return line;		
		}
}

