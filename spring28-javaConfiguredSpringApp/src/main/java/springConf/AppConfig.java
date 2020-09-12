package springConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
	
}
