package com.demo.spring.config;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
@EnableScheduling
public class MyAppConfig implements SchedulingConfigurer {

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		// TODO Auto-generated method stub
		System.out.println("I am here");
		taskRegistrar.addTriggerTask(
			new Runnable() {
			
			@Override
			public void run() {
				System.out.println("To get bean " + new Date());					
			}
		}, new Trigger() {
			
			@Override
			public Date nextExecutionTime(TriggerContext triggerContext) {
				Calendar nextExecutionTime =  new GregorianCalendar();
				 Date lastActualExecutionTime = triggerContext.lastActualExecutionTime();
                 nextExecutionTime.setTime(lastActualExecutionTime != null ? lastActualExecutionTime : new Date());
                nextExecutionTime.add(Calendar.MILLISECOND, 5000); //you can get the value from wherever you want
//                /System.out.println("nextExecutionTime.getTime(): "+nextExecutionTime.getTime());
                return nextExecutionTime.getTime();	
			}
		});
	}

}
