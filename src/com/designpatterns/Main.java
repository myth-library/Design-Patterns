package com.designpatterns;

import com.designpatterns.command.editor.BoldCommand;
import com.designpatterns.command.editor.History;
import com.designpatterns.command.editor.HtmlDocument;
import com.designpatterns.command.editor.UndoCommand;

public class Main {
	public static void main(String[] args) {
		var history = new History();
		var document = new HtmlDocument();
		document.setContent("Hello World");
		
		var boldCommand = new BoldCommand(document, history);
		boldCommand.execute();
		System.out.println(document.getContent());
		
		var undoCommand = new UndoCommand(history);
		undoCommand.execute();
		System.out.println(document.getContent());
	}
}
