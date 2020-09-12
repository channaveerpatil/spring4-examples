package fooddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

	public static void main(String[] args) {
			
		
			// Fruit fruit = new Fruit();
			// Vegetable vegetable = new Vegetable();
		
 			ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
			
			Fruit fruit = context.getBean("fruit", Fruit.class);
 			System.out.println(fruit.talkAboutYourself());

		 
					
			((FileSystemXmlApplicationContext)context).close();
	}

}
