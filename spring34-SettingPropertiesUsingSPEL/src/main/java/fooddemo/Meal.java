package fooddemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Meal {
	
	@Value("#{myDemoFruit}")
	private Fruit fruit;
	
	@Value("#{myDemoFruit.name}")
	private String fruitName;
	
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

 

	public String whatsInThisMeal(){
		
		String answer = "This Meal contains: ";
		
		if(fruit!=null) answer+=" Some Fruits (" +fruit.getName() +") \n" ;
		return answer;
	}

}
