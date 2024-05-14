package com.designpatterns;

import com.designpatterns.command.BlackAndWhiteCommand;
import com.designpatterns.command.CompositeCommand;
import com.designpatterns.command.ResizeCommand;

public class Main {
	public static void main(String[] args) {
		var composite = new CompositeCommand();
		composite.add(new ResizeCommand());
		composite.add(new BlackAndWhiteCommand());
		composite.execute();
		
		// We can replay this multiple times
		composite.execute();
	}
}
