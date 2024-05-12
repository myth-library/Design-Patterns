package com.designpatterns.abstractfactory.material;

import com.designpatterns.abstractfactory.IButton;
import com.designpatterns.abstractfactory.ITextBox;
import com.designpatterns.abstractfactory.IWidgetFactory;

public class MaterialWidgetFactory implements IWidgetFactory {
	@Override
	public IButton createButton() {
		return new MaterialButton();
	}

	@Override
	public ITextBox createTextBox() {
		return new MaterialTextBox();
	}
}
