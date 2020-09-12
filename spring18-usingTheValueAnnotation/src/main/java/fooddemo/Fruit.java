package fooddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fruit {

	String definition = "not set";
	
	public Fruit(){}
	public String getDefinition() {
		return definition;
	}

	@Autowired
	public void setDefinition(@Value("Hi I am fruit from Fruit class via @Value annotation.") String definition) {
		this.definition = definition;
	}

	public String talkAboutYourself(){
		return definition;	
	}
	
}
