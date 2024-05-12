package com.designpatterns.abstractfactory;

public interface IWidgetFactory {
	IButton createButton();
	ITextBox createTextBox();
}
