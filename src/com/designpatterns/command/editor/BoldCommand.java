package com.designpatterns.command.editor;

public class BoldCommand implements IUndoableCommand {
	private String previousContent;
	private HtmlDocument document;
	private History history;
	
	public BoldCommand(HtmlDocument document, History history) {
		this.document = document;
		this.history = history;
	}

	@Override
	public void execute() {
		previousContent = document.getContent();
		document.makeBold();
		history.push(this);  // this = current object
	}

	@Override
	public void unexecute() {
		document.setContent(previousContent);
	}
}
