package fooddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class Meal {
	
	@Autowired(required=false)
	private Fruit fruit;
	
	@Autowired
	private Dairy dairy;
	
	@Autowired
	private Grain grain;
	
	@Autowired
	private Meat meat;
	
	@Autowired
	private Vegetable vegetable;
		
	public Fruit getFruit() {
		return fruit;
	}

	// @Autowired
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	// @Autowired
	public Dairy getDairy() {
		return dairy;
	}

	// @Autowired
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public Grain getGrain() {
		return grain;
	}

	// @Autowired
	public void setGrain(Grain grain) {
		this.grain = grain;
	}

	
	public Meat getMeat() {
		return meat;
	}

	// @Autowired
	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Vegetable getVegetable() {
		return vegetable;
	}

	@Autowired
	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}

	public String whatsInThisMeal(){
		
		String answer = "This Meal contains: ";
		
		if(fruit!=null) answer+=" Some Fruits ";
		if(dairy!=null) answer+=" Some Dairy ";
		if(grain!=null) answer+=" Some Grain ";
		if(meat!=null) answer+=" Some Meat ";
		if(vegetable!=null) answer+=" Some Vegetable ";
		return answer;
	}

}
