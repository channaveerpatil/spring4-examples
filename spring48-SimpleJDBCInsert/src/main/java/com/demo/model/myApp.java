/**
 * 
 */
package com.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.DataAccessException;


/**
 * @author channaveer.p
 *
 */
public class myApp {


	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		FoodGroupDAO myFoodGroupDAO = appContext.getBean("foodGroupDAO", FoodGroupDAO.class);

		try{
			
			FoodGroup foodGroup = new FoodGroup("Vegetable Potato", "Hi, I am potato from vegetable category");
			Number affectedRowsArray =  myFoodGroupDAO.createSI(foodGroup);
			System.out.println("No of rows affected: " + affectedRowsArray);
		} 
		
		catch (DataAccessException dae){

			System.out.println(dae.getMessage());

		}
		((FileSystemXmlApplicationContext) appContext).close();
	}

}
