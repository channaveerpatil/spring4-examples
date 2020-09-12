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
		 
		 FoodGroup vegetable = myFoodGroupDAO.getFoodGoup(2);
		 System.out.println(vegetable.talkAboutYourself());

		 FoodGroup fruits = myFoodGroupDAO.getFoodGoup(1);
		 System.out.println(fruits.talkAboutYourself());

		 myFoodGroupDAO.addFoodGroup("NotRealFoodGroup", "This is not a real food group");
		 
		 List<FoodGroup> myFoodGroups = myFoodGroupDAO.getFoodGroups();
		 
		 for(FoodGroup foodgroup: myFoodGroups){
			 System.out.println(foodgroup.talkAboutYourself());
		 }
		 
		 
		
		((FileSystemXmlApplicationContext) appContext).close();
	}

}
