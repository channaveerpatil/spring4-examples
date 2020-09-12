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
			Vegetable vegetable = (Vegetable) context.getBean("vegetable");
			
			System.out.println(fruit.talkAboutYourself());
			System.out.println(vegetable.talkAboutYourself());
			
			Vegetable vegWithName = (Vegetable) context.getBean("vegWithName");
			Vegetable vegWithPNameSpace = (Vegetable) context.getBean("vegWithPNameSpace");
			
			Meal mySpringMeal = (Meal) context.getBean("meal");
			System.out.println(mySpringMeal.whatsInThisMeal());
			
			
			System.out.println(vegWithName.talkAboutYourself());
			System.out.println(vegWithPNameSpace.talkAboutYourself());

			((ClassPathXmlApplicationContext)context).close();
					
	}

}
