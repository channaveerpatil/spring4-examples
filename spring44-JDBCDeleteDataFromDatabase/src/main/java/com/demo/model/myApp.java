/**
 * 
 */
package com.demo.model;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * @author channaveer.p
 *
 */
public class myApp {

	 
	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		 FoodGroupDAO myFoodGroupDAO = appContext.getBean("foodGroupDAO", FoodGroupDAO.class);
		 
		 // FoodGroup foodGroup = new FoodGroup(12,"aRandomFoodGropu", "a Random Food Group Description");
		 
		 myFoodGroupDAO.delete(12);

		 ((FileSystemXmlApplicationContext) appContext).close();
	}

}
