package myAppPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fooddemo.Fruit;
import fooddemo.Meal;
import fooddemo.Vegetable;

public class HelloFood {

	public static void main(String[] args) {
			
 			ApplicationContext context = new ClassPathXmlApplicationContext("springConf/appContext.xml");
 
			Meal mealByAnnotaion = (Meal) context.getBean("mealByAnnotaion");
			System.out.println("Autowired Meal: " +mealByAnnotaion.whatsInThisMeal());
 
			((ClassPathXmlApplicationContext)context).close();
					
	}

}
