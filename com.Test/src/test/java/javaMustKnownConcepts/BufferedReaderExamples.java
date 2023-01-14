package javaMustKnownConcepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExamples {

	public static void main(String[] args) {
		
		String location = ("E:\\Adhavan\\Notes\\7. Java Concepts Must Known\\File Reader\\Buffered Reader.txt");
		
		try {
			FileReader fileReader = new FileReader(location);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String allLines;
			
			while((allLines=bufferedReader.readLine())!=null)  {
				System.out.println(allLines);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
