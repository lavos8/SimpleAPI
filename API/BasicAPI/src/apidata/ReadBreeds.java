package apidata;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadBreeds {
	
public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();

		try {
			Object obj = parser.parse(new FileReader("C:\\apidata.json"));

			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);

			String name = (String) jsonObject.get("breedBame");
			System.out.println(name);

			String subBreed = (String) jsonObject.get("subBreed");
			System.out.println(department);

			JSONArray remarks = (JSONArray) jsonObject.get("remarks");
			Iterator<String> iterator = remarks.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	

}
