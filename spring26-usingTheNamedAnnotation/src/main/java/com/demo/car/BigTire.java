package com.demo.car;

import org.springframework.stereotype.Component;

import com.demo.annot.AnotherRandomAnnotation;

// @Component

@AnotherRandomAnnotation
public class BigTire implements Tire {

	public String getTireDiameter() {
		return "16 inch diameter";
	}

	private void roll() {
	

	}
}