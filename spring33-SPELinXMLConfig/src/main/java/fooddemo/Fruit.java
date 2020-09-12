package fooddemo;

public class Fruit {

	private String name;
	
	private int nutritionalRating;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNutritionalRating() {
		return nutritionalRating;
	}

	public void setNutritionalRating(int nutritionalRating) {
		this.nutritionalRating = nutritionalRating;
	}

	public Fruit(){
		// No argument constructor
	}
	
	public String talkAboutYourself(){
		
		String about = " Hi I am from Fruit, I come from plants or tree with seeds " +"\n";
		if(this.name!= null && name!=""){about += "My Name is " +name +"\n";}
		if(this.nutritionalRating>0) about+= "my nutrition rating is: " + nutritionalRating +"\n";
		return about;
	}
	
}
