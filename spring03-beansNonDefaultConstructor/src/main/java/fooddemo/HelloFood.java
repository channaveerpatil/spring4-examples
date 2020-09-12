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
			Vegetable vegetable = (Vegetable) context.getBean("vegetable");
			System.out.println(fruit.talkAboutYourself());

			Fruit otherFruit = context.getBean("beanWithName", Fruit.class);
			
			System.out.println(otherFruit.talkAboutYourself());
			vegetable.talkAboutYourself();
					
			((FileSystemXmlApplicationContext)context).close();
	}

}
