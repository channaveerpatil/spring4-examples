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
			
			Meal mySpringMeal = (Meal) context.getBean("meal");
			System.out.println(mySpringMeal.whatsInThisMeal());
			
			Meal autowiredByConstructor = (Meal) context.getBean("autowiredByConstructor");
			System.out.println(autowiredByConstructor.whatsInThisMeal());
			
			
			((ClassPathXmlApplicationContext)context).close();
					
	}

}