package car;

import javax.annotation.*;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class FamilyCar {

	@Inject
	@Named("smallTire")
	private Tire frontleft;
	
	@Inject
	@Named("smallTire")
	private Tire frontright;
	
	@Inject
	@Named("smallTire")
	private Tire reartleft;
	
	@Inject
	@Named("smallTire")
	private Tire reartright;
	
	@Inject
	@Named("sixCyl")
	private Engine engineType;

	public Tire getFrontleft() {
		return frontleft;
	}

	public void setFrontleft(Tire frontleft) {
		this.frontleft = frontleft;
	}

	public Tire getFrontright() {
		return frontright;
	}

	public void setFrontright(Tire frontright) {
		this.frontright = frontright;
	}

	public Tire getReartleft() {
		return reartleft;
	}

	public void setReartleft(Tire reartleft) {
		this.reartleft = reartleft;
	}

	public Tire getReartright() {
		return reartright;
	}

	public void setReartright(Tire reartright) {
		this.reartright = reartright;
	}

	public Engine getEngineType() {
		return engineType;
	}

	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}
	
	public String getCarDescription(){
		
		String description ="";
		if(frontleft!=null){description+="Front Left Tire: " + frontleft.getTireDiameter()+"\n";}
		if(frontright!=null){description+="Front Right Tire: "+ frontright.getTireDiameter()+"\n";}
		if(reartleft!=null){description+="Rear Left Tire: "+ reartleft.getTireDiameter()+"\n";}
		if(reartright!=null){description+="Rear Left Tire: "+ reartright.getTireDiameter()+"\n";}
		if(engineType!=null){description+="Engine Type: " + engineType.getNumberOfCylinders()+"\n";}
		if(description==""){description+="not set \n";}
		return description;
	}
	
}
