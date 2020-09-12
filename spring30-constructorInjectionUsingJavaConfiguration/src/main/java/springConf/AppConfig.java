package springConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import car.FamilyCar;
import car.FourCylinderEngine;
import car.SixCylinderEngine;

@Configuration
public class AppConfig {

	@Bean(name="fourCyl")
	public FourCylinderEngine getFourCyl() {
		return new FourCylinderEngine();

	}
	
	@Bean(name="sixCyl")
	public SixCylinderEngine getSixCyl() {
		return  new SixCylinderEngine();
	}
	
	@Bean(name="familyCar")
	public FamilyCar getFamilyCar(){

		//Create instance
		FamilyCar familyCar = new FamilyCar(getFourCyl());
		
		return familyCar;
		
		
	}
	
}
