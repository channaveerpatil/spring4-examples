package car;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component("sixCyl")
public class SixCylinderEngine implements Engine {

	public int getNumberOfCylinders() {
		// TODO Auto-generated method stub
		return 6;
	}

	public String drive() {
		// TODO Auto-generated method stub
		return "Drive Efficiently with 6 cylinders";
	}

	
}
