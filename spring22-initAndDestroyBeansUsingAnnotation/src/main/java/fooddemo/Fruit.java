package fooddemo;


import javax.annotation.*;

public class Fruit {

	String description = "not set";
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Fruit(){	}
	
	@PostConstruct
	public void initMethod(){
		System.out.println("The fruit bean is ready to go. " + this.description);
	}
	
	@PreDestroy
	public void destroyMethod(){
		System.out.println("The Fruit bean is about to destroy. " +this.description);
	}
	
	public String talkAboutYourself(){
			 
		return description;
	}
	
}
