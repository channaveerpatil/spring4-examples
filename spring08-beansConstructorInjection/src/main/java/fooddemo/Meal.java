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
	
	public String whatsInThisMeal(){
		
		String answer = "This Meal contains: ";
		
		if(fruit!=null) answer+=" Some Fruits, ";
		if(dairy!=null) answer+=" Some Dairy, ";
		if(grain!=null) answer+=" Some Grain, ";
		if(meat!=null) answer+=" Some Meat & ";
		if(vegetable!=null) answer+=" Some Vegetable ";
		return answer;
	}

}
