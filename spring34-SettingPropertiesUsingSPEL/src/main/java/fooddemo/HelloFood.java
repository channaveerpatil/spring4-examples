package fooddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

	public static void main(String[] args) {
			
		
			// Fruit fruit = new Fruit();
			// Vegetable vegetable = new Vegetable();
		
 			ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
			
			Meal myMeal = context.getBean("meal", Meal.class);
			
 			System.out.println("Fruit in meal assigned from SPEL: "+ myMeal.getFruit().talkAboutYourself());

 			System.out.println("Name of the fruit directly set from SPEL: " + myMeal.getFruitName());
					
			((FileSystemXmlApplicationContext)context).close();
	}

}
