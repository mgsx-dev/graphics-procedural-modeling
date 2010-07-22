package org.mgs.graphics.pm.render.views;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

abstract public class ConsoleUtil {
	
	public static MessageConsole getConsole(String name){
		IConsoleManager manager = ConsolePlugin.getDefault().getConsoleManager();
		IConsole [] consoles = manager.getConsoles();
		for(IConsole console : consoles){
			if(console.getName().equals(name)){
				return (MessageConsole)console;
			}
		}
		MessageConsole messageConsole = new MessageConsole(name, null);
		manager.addConsoles(new IConsole[]{messageConsole});
		return messageConsole;
	}
	
}