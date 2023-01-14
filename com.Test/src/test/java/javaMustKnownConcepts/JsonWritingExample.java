package javaMustKnownConcepts;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample {

	public static void main(String[] args) {

		try {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Name", "Adhav");
			jsonObject.put("Age", 30);

			JSONArray array = new JSONArray();
			array.add("Self Confident");
			array.add("Wise man");

			jsonObject.put("Special talent", array);

			FileWriter fileWriter = new FileWriter(
					"E:\\Adhavan\\Notes\\7. Java Concepts Must Known\\Json\\Json Writter.txt");
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
