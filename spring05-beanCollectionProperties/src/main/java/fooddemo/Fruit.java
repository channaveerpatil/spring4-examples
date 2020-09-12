package fooddemo;


import java.util.List;
import java.util.Map;

public class Fruit {

	public Fruit(){	}
	
	private List<String> fruitNameList;
	private Map<String, String> fruitNameMap;
	
	public List<String> getFruitNameList() {
		return fruitNameList;
	}


	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}


	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}


	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}
	
	
	public String talkAboutYourself(){
		String speech = "Hi I am from Fruit, I come from plants or tree with seeds";
		
		if(fruitNameList!=null && fruitNameList.size()>0){
			speech += "\nList:";
			for(String name: fruitNameList){
				speech+=". Name " + name;
			}
		}
		
		if(fruitNameMap!=null && fruitNameMap.size()>0){
			speech += "\nMap:";
			for(Map.Entry<String, String> name: fruitNameMap.entrySet()){
				speech+= name.getKey() +" --> "+ name.getValue();
			}
		}
		
		return speech;
	}
	
}
