package fooddemo;

public class Fruit {

	public Fruit(){
		// No argument constructor
	}
	
	public Fruit(String name){
		setMyName(name);
	}
	
	private String myName ;
	
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String talkAboutYourself(){
		
		String speech = " Hi I am from Fruit, I come from plants or tree with seeds ";
		if(myName!= null && myName!=""){
			speech = speech+"My Name is " +myName;
		}
		return speech;
	}
	
}
