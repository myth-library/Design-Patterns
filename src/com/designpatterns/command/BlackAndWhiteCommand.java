package com.designpatterns.command;

import com.designpatterns.command.fx.ICommand;

public class BlackAndWhiteCommand implements ICommand {
	@Override
	public void execute() {
		System.out.println("Black and White");
	}
}
