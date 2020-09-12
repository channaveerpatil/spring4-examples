package myAppPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;

public class myApp {

	public static void main(String[] args) {
			
 			ApplicationContext context = new ClassPathXmlApplicationContext("springConf/appContext.xml");
 
 			FourCylinderEngine fourCyl = context.getBean(FourCylinderEngine.class);
 			System.out.println("My Four: "+fourCyl.getNumberOfCylinders());
 			

 			SixCylinderEngine sixCyl = (SixCylinderEngine) context.getBean("sixCyl");
 			System.out.println("My Six: "+sixCyl.getNumberOfCylinders());

 			
			FamilyCar myFamilyCar= context.getBean(FamilyCar.class);
			System.out.println(myFamilyCar.getCarDescription());
			
			
			((ClassPathXmlApplicationContext)context).close();
					
	}

}
