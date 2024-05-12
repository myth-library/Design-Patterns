package com.designpatterns.abstractfactory.app;

import com.designpatterns.abstractfactory.IWidgetFactory;

public class ContactForm {
	public void render(IWidgetFactory factory) {
		factory.createButton().render();
		factory.createTextBox().render();
	}
}
