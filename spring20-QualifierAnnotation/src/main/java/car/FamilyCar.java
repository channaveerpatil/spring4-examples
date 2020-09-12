package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FamilyCar {

	@Autowired
	@Qualifier(value="sTire")
	private Tire frontleft;
	
	@Autowired
	@Qualifier(value="sTire")
	private Tire frontright;
	
	@Autowired
	@Qualifier(value="bTire")
	private Tire reartleft;
	
	@Autowired
	@Qualifier(value="bTire")
	private Tire reartright;
	
	@Autowired
	@Qualifier(value="fourCyl")
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
