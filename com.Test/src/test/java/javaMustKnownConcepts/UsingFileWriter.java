package javaMustKnownConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) {

		String location = ("E:\\Adhavan\\File Writer\\File Writter.txt");
		String content = ("This is file wrtter method");

		try {
			FileWriter fileWriter = new FileWriter(location);
			fileWriter.write(content);
			System.out.println("Completed");
			fileWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
