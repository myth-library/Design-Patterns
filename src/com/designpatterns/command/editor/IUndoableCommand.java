package com.designpatterns.command.editor;

public interface IUndoableCommand extends ICommand {
	void unexecute();
}
