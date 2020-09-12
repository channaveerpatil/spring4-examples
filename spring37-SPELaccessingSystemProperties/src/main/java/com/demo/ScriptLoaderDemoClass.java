/**
 * 
 */
package com.demo;

/**
 * @author channaveer.p
 *
 */
public class ScriptLoaderDemoClass {

	private ICommandLineScript script;

	private String osname;
	
	public String getOsname() {
		return osname;
	}

	public void setOsname(String osname) {
		this.osname = osname;
	}

	public ICommandLineScript getScript() {
		return script;
	}

	public void setScript(ICommandLineScript script) {
		this.script = script;
	}
	
	public ScriptLoaderDemoClass() {
	}
	
	public void loadScript() {
		System.out.println("Loading script of type: " +script.getClass());
		System.out.println(script.viewDirectoryContents("myDir"));
	}
}
