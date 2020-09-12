package springConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;

@Configuration
@ComponentScan({"car"})
public class AppConfig {

	// Expilicit Bean Registration
	
	@Bean(name="fourCyl")
	public FourCylinderEngine getFourCyl() {
		return new FourCylinderEngine();

	}
	
//	@Bean(name="sixCyl")
//	public SixCylinderEngine getSixCyl() {
//		return  new SixCylinderEngine();
//	}
//	
	@Bean(name="familyCar")
	public FamilyCar getFamilyCar(){

		//Create instance
		// We want to autowire an engine type 
		FamilyCar familyCar = new FamilyCar();
		
		return familyCar;
		
		
	}
	
}
