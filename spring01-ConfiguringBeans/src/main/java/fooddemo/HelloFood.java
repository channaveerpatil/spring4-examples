package fooddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

	public static void main(String[] args) {
			
		
			// Fruit fruit = new Fruit();
			// Vegetable vegetable = new Vegetable();
		
			@SuppressWarnings("resource")
			ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
			
			Fruit fruit = context.getBean("fruit", Fruit.class);
			Vegetable vegetable = (Vegetable) context.getBean("vegetable");
			
			fruit.talkAboutYourself();
			vegetable.talkAboutYourself();
					
	}

}
