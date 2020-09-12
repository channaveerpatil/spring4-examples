package fooddemo;

public class Vegetable {

	private String myName;
	
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String talkAboutYourself(){
		String speech = "Hi I am from Vegetable, I am plant that eaten as food";
		if(myName!= null && myName!=""){
			speech = speech + " & My Name is " + myName;
		}
		return speech;
	}
}
