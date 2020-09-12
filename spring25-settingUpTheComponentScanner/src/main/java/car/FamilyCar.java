package car;

import javax.annotation.*;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("familyCar")
public class FamilyCar {

	@Autowired
	@Qualifier("fourCyl")
	private Engine engineType;
	
	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}

	public String getCarDescription(){
		
		String description ="";
 
		if(engineType!=null){description+="Engine Size: " + engineType.getNumberOfCylinders()+"\n";}
		if(description==""){description+="not set \n";}
		return description;
	}
	
}
