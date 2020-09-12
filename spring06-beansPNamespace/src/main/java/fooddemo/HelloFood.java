package fooddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

	public static void main(String[] args) {
			
		
			// Fruit fruit = new Fruit();
			// Vegetable vegetable = new Vegetable();
		
 			ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
			
			Fruit fruit = context.getBean("fruit", Fruit.class);
			Vegetable vegetable = (Vegetable) context.getBean("vegetable");
			
			System.out.println(fruit.talkAboutYourself());
			System.out.println(vegetable.talkAboutYourself());
			
			Vegetable vegWithName = (Vegetable) context.getBean("vegWithName");
			Vegetable vegWithPNameSpace = (Vegetable) context.getBean("vegWithPNameSpace");
			
			System.out.println(vegWithName.talkAboutYourself());
			System.out.println(vegWithPNameSpace.talkAboutYourself());

			((FileSystemXmlApplicationContext)context).close();
					
	}

}
