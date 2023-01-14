package javaMustKnownConcepts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWritter {

	public static void main(String[] args) {

		String location = ("E:\\Adhavan\\File Writer\\Buffered Writter.txt");
		String content = ("This is Buffered Writter Method");

		try {
			FileWriter fileWriter = new FileWriter(location);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(content);
			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
