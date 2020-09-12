/**
 * 
 */
package com.demo.model;

import java.util.ArrayList;
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
		 
		 FoodGroup foodGroup1 = new FoodGroup("a1RandomFoodGropu", "a1 Random Food Group Description");
		 FoodGroup foodGroup2 = new FoodGroup("bRandomFoodGropu", "b Random Food Group Description");
		 FoodGroup foodGroup3 = new FoodGroup("cRandomFoodGropu", "c Random Food Group Description");
		 
		 List<FoodGroup> foodGrouplist = new ArrayList<FoodGroup>();
		 
		 foodGrouplist.add(foodGroup1);
		 foodGrouplist.add(foodGroup2);
		 foodGrouplist.add(foodGroup3);
		 
		int [] affectedRowsArray =  myFoodGroupDAO.createFoodGroups(foodGrouplist);
		
		for(int i : affectedRowsArray){
			System.out.println("Updated rows" +i);
		}

		 ((FileSystemXmlApplicationContext) appContext).close();
	}

}
