package fooddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fruit")
public class Fruit {

	private String name;
	
	private int nutritionalRating;
	
	public String getName() {
		return name;
	}

	/*@Autowired
	public void setName(@Value("#{'Granny Smith' + ' Apple'}") String name) {
		this.name = name;
	}*/
	
	/*@Autowired
	public void setName(@Value("#{demoDataSource.getAppleType() + ' Apple'}") String name) {
		this.name = name;
	}*/

	@Autowired
	public void setName(@Value("#{T(fooddemo.DataSource).getAppleTypeStatic() + ' Apple'}") String name) {
		this.name = name;
	}
	
	
	public int getNutritionalRating() {
		return nutritionalRating;
	}

	@Autowired
	public void setNutritionalRating(@Value("#{T(java.lang.Math).random() * 10 + demoDataSource.getAppleType().length() }") int nutritionalRating) {
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
