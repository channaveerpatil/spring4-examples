package fooddemo;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component("demoDataSource")
public class DataSource {

	public String appleDescription = "Hi, I am an apple description";
	
	
	public static String getAppleTypeStatic(){
		ArrayList<String> appleTypes = new ArrayList<String>();
		appleTypes.add("State Fair");
		appleTypes.add("Kashmiri apple");
		appleTypes.add("McIntosh");
		appleTypes.add("HoneyCrisp");
		appleTypes.add("Regent");
		appleTypes.add("Pinat");
		appleTypes.add("Granny Smith");
		
		int index = new Random().nextInt(appleTypes.size());
		String type = appleTypes.get(index);
		// return type;
		
				return null;
	}
	
	
	public String getAppleType() {

		ArrayList<String> appleTypes = new ArrayList<String>();
		appleTypes.add("State Fair");
		appleTypes.add("Kashmiri apple");
		appleTypes.add("McIntosh");
		appleTypes.add("HoneyCrisp");
		appleTypes.add("Regent");
		appleTypes.add("Pinat");
		appleTypes.add("Granny Smith");
		
		int index = new Random().nextInt(appleTypes.size());
		String type = appleTypes.get(index);
		return type;
	}
}
