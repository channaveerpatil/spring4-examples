/**
 * 
 */
package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author channaveer.p
 *
 */
public class myApp {
 
	public static void main(String[] args) {

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		ScriptLoaderDemoClass sl = appContext.getBean("sl", ScriptLoaderDemoClass.class);
		sl.loadScript();
		System.out.println(sl.getOsname());
		
				
		
		((FileSystemXmlApplicationContext) appContext).close();
	}

}
