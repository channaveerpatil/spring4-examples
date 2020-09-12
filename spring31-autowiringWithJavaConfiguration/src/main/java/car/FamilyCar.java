package car;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

 
public class FamilyCar {

	//@Autowired
	//@Qualifier("sixCyl")
	private Engine engineType;
	
	public FamilyCar() {}
	
	public Engine getEngineType() {
		return engineType;
	}
	
	@Autowired
	@Qualifier("sixCyl")
	public void setEngineType(Engine engineType) {
		System.out.println("Setting engine using injection");
		this.engineType = engineType;
	}

	public String getCarDescription(){
		
		String description ="";
 
		if(engineType!=null){description+="Engine Size: " + engineType.getNumberOfCylinders()+"\n";}
		if(description==""){description+="not set \n";}
		return description;
	}
	
}
