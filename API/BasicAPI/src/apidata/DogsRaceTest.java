package apidata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DogsRaceTest {
	
    private Map<String, Dogs> dogMap = new HashMap<>();
	
	private void DogStore(){
		dogMap.put("wolfhound", new Dogs("Ada", "Ada Lovelace was the first programmer."));
		dogMap.put("vizsla", new Dogs("Kevin", "Kevin is the author of HappyCoding.io."));
		dogMap.put("stbernard", new Dogs("Stanley", "Stanley is Kevin's cat."));
	}

	public Dogs getBreed(String name) {
		return dogMap.get(name);
	}

	public void putBreed(Dogs person) {
		dogMap.put(person.getName(), person);
	}
	

}
