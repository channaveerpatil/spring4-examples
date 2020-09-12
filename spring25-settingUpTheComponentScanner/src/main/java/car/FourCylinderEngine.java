package car;

import org.springframework.stereotype.Component;

@Component("fourCyl")
public class FourCylinderEngine implements Engine{

	public int getNumberOfCylinders() {
 		return 4;
	}

	public String drive() {
		
		return "Drive Efficiently with 4 Cylinders";
	}

}
