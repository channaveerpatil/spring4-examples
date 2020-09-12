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
			
 
			Meal mySpringMeal = (Meal) context.getBean("meal");
			System.out.println(mySpringMeal.whatsInThisMeal());

			Meal beanAutowire = (Meal) context.getBean("beanAutowire");
			System.out.println("Autowired Meal: " +beanAutowire.whatsInThisMeal());
 
			((ClassPathXmlApplicationContext)context).close();
					
	}

}
