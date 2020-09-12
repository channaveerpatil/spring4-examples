package myAppPkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.car.BigTire;
import com.demo.car.FamilyCar;
import com.demo.car.FourCylinderEngine;
import com.demo.car.SixCylinderEngine;
import com.demo.car.SmallTire;

public class myApp {

	public static void main(String[] args) {
			
 			ApplicationContext context = new ClassPathXmlApplicationContext("springConf/appContext.xml");
 
 			SmallTire smallTire = context.getBean(SmallTire.class);
 			System.out.println("Small Tire Diameter: "+smallTire.getTireDiameter());
 			
 			BigTire bigTire = context.getBean(BigTire.class);
 			System.out.println("Big Tire Diameter: "+bigTire.getTireDiameter());
			
			
			((ClassPathXmlApplicationContext)context).close();
					
	}

}
