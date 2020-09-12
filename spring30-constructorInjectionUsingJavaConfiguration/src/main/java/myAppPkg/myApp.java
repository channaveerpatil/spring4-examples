package myAppPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;
import springConf.AppConfig;

public class myApp {

	public static void main(String[] args) {
			
 			// ApplicationContext context = new ClassPathXmlApplicationContext("springConf/appContext.xml");
		
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
 			FourCylinderEngine fourCyl = (FourCylinderEngine) context.getBean("fourCyl");
 			System.out.println("My Four: "+fourCyl.getNumberOfCylinders());
 			

 			SixCylinderEngine sixCyl = (SixCylinderEngine) context.getBean("sixCyl");
 			System.out.println("My Six: "+sixCyl.getNumberOfCylinders());

 			FamilyCar familyCar = context.getBean("familyCar", FamilyCar.class);
 			System.out.println("Family Car:" + familyCar.getCarDescription());
 			
			((AnnotationConfigApplicationContext)context).close();
					
	}

}
