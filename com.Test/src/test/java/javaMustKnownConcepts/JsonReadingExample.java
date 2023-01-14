package javaMustKnownConcepts;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) {
		try {
			JSONParser jsonParser = new JSONParser();
			FileReader fileReader = new FileReader(
					"E:\\Adhavan\\Notes\\7. Java Concepts Must Known\\Json\\Json Writter.txt");
			Object parserObject = jsonParser.parse(fileReader);

			JSONObject jsonObject = (JSONObject) parserObject;
			String name = (String) jsonObject.get("Name");
			Long age = (Long) jsonObject.get("Age");
			JSONArray array = (JSONArray) jsonObject.get("Special talent");

			System.out.println("The Name is : " + name);
			System.out.println("The Age is : " + age);
			Iterator iterator = array.iterator();
			while (iterator.hasNext()) {
				System.out.println("The Special talent is " + iterator.next());
			}

		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}
