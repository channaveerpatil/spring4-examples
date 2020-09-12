package myAppPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.FamilyCar;

public class myApp {

	public static void main(String[] args) {
			
 			ApplicationContext context = new ClassPathXmlApplicationContext("springConf/appContext.xml");
 
			FamilyCar myFamilyCar= (FamilyCar) context.getBean("familyCar");
			System.out.println(myFamilyCar.getCarDescription());
			
			FamilyCar altFamilyCar = (FamilyCar) context.getBean("altFamilyCar");
			System.out.println(altFamilyCar.getCarDescription());
			
			((ClassPathXmlApplicationContext)context).close();
					
	}

}
