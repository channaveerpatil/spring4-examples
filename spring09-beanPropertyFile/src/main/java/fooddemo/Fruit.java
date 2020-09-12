package fooddemo;

public class Fruit {

	String definition = "not set";
	
	public Fruit(){}
	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String talkAboutYourself(){
		return definition;	
	}
	
}
