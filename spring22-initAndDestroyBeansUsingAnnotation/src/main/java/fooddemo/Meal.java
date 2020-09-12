package fooddemo;

public class Meal {
	
	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable vegetable;
		
	
	public Meal(){}
	
	public Meal(Fruit f, Dairy d, Grain g, Meat m, Vegetable v){
		this.fruit = f;
		this.dairy = d;
		this.grain = g;
		this.meat = m; 
		this.vegetable = v;
	}
	
	
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

	public Vegetable getVegetable() {
		return vegetable;
	}

	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}

	public String whatsInThisMeal(){
		
		String answer = "This Meal contains: ";
		
		if(fruit!=null) answer+= fruit.talkAboutYourself()+"\n";
		if(dairy!=null) answer+=dairy.talkAboutYourself()+"\n";
		if(grain!=null) answer+= grain.talkAboutYourself()+"\n";
		if(meat!=null) answer+= meat.talkAboutYourself()+"\n";
		if(vegetable!=null) answer+= vegetable.talkAboutYourself()+"\n";
		return answer;
	}

}
