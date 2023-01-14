package javaMustKnownConcepts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) {

		String location = ("E:\\Adhavan\\File Writer\\path.txt");
		String content = ("This is Path Method");

		try {
			Path path = Paths.get(location);
			Files.write(path, content.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
