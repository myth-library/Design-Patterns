package com.designpatterns.abstractfactory.ant;

import com.designpatterns.abstractfactory.IButton;
import com.designpatterns.abstractfactory.ITextBox;
import com.designpatterns.abstractfactory.IWidgetFactory;

public class AntWidgetFactory implements IWidgetFactory {
	@Override
	public IButton createButton() {
		return new AntButton();
	}

	@Override
	public ITextBox createTextBox() {
		return new AntTextBox();
	}
}
