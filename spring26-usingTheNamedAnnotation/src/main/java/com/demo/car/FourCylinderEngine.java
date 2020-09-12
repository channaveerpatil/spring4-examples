package com.demo.car;

import javax.inject.Named;

@Named
public class FourCylinderEngine implements Engine{

	public int getNumberOfCylinders() {
 		return 4;
	}

	public String drive() {
		
		return "Drive Efficiently with 4 Cylinders";
	}

}
