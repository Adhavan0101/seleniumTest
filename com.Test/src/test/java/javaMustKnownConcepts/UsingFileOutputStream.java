package javaMustKnownConcepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) {

		String location = ("E:\\Adhavan\\File Writer\\FOS.txt");
		String content = ("This is File Output Stream Method");

		try {
			FileOutputStream outputStream = new FileOutputStream(location);
			byte[] writeFOS = content.getBytes();
			outputStream.write(writeFOS);
			outputStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
