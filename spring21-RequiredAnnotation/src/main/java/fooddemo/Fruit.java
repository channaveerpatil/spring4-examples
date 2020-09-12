package fooddemo;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Fruit {

	private String description;
	
	public String getDescription() {
		return description;
	}
	
	@Required()
	@Value(value = "Hi")
	public void setDescription(String description) {
		this.description = description;
	}
	
 	public Fruit(){	} 
	
	public String talkAboutYourself(){
		
		String result = description;
		
		if(result == null) result = "no description set";
		
	 
		return result;
	}
	
}
