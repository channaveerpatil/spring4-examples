package myAppPkg;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
 
@Configurable
@EnableScheduling
public class MyAppConfig implements SchedulingConfigurer {

 
    
 	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
 
		System.out.println("I am here!");
	 
		
		}
	}
