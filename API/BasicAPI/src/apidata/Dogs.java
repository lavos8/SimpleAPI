package apidata;

public class Dogs {
	private String breed;
	private String subBreed;
	
	public Dogs(String breed, String subBreed) {
		this.breed = breed;
		this.subBreed = subBreed;
	}

	public String getName() {
		return breed;
	}

	public String getAbout() {
		return subBreed;
	}	

}
