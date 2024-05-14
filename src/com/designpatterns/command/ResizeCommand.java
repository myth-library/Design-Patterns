package com.designpatterns.command;

import com.designpatterns.command.fx.ICommand;

public class ResizeCommand implements ICommand {
	@Override
	public void execute() {
		System.out.println("Resized");
	}
}
