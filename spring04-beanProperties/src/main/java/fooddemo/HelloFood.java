package fooddemo;

import java.util.Properties;

import javax.security.auth.login.ConfigurationSpi;

import org.springframework.beans.ConfigurablePropertyAccessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
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
			Properties properties = new Properties();
			properties.setProperty("veg.name", "AppleAbc");
			
			// ConfigurablePropertyAccessor accessor = 
			
			System.out.println(properties.getProperty("veg.name"));
			System.out.println(vegWithName.talkAboutYourself());

			((FileSystemXmlApplicationContext)context).close();
					
	}

}
