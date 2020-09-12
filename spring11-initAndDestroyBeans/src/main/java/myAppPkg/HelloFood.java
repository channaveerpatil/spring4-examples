package myAppPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fooddemo.Fruit;
import fooddemo.Meal;
import fooddemo.Vegetable;

public class HelloFood {

	public static void main(String[] args) {
			
		
			// Fruit fruit = new Fruit();
			// Vegetable vegetable = new Vegetable();
		
 			ApplicationContext context = new ClassPathXmlApplicationContext("springConf/appContext.xml");
			
 
			Fruit fruit = context.getBean("fruit", Fruit.class);
			System.out.println("Spring Meal: "+fruit.talkAboutYourself());
			
			((ClassPathXmlApplicationContext)context).close();
					
	}

}
