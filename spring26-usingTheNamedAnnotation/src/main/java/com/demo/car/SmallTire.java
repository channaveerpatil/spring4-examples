package com.demo.car;

import org.springframework.stereotype.Component;

import com.demo.annot.RandomDemoAnnotation;

// @Component

@RandomDemoAnnotation
public class SmallTire implements Tire {

	public String getTireDiameter() {
		
		return "12 inch diameter";
	}
	
	public String roll(){
		
		return null;
	}

}
