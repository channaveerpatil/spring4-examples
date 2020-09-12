package fooddemo;

public class Meal {
	
	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable veg;
		
	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Dairy getDairy() {
		return dairy;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public Grain getGrain() {
		return grain;
	}

	public void setGrain(Grain grain) {
		this.grain = grain;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Vegetable getVeg() {
		return veg;
	}

	public void setVeg(Vegetable veg) {
		this.veg = veg;
	}

	public String whatsInThisMeal(){
		
		String answer = "This Meal contains: ";
		
		if(fruit!=null) answer+=" Some Fruits:";
		if(dairy!=null) answer+=" Some Dairy:";
		if(grain!=null) answer+=" Some Grain:";
		if(meat!=null) answer+=" Some Meat:";
		if(veg!=null) answer+=" Some Vegetable:";
		return answer;
	}

}
