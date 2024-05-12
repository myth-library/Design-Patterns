package com.designpatterns;

import com.designpatterns.abstractfactory.app.ContactForm;
import com.designpatterns.abstractfactory.ant.AntWidgetFactory;
import com.designpatterns.abstractfactory.material.MaterialWidgetFactory;

public class Main {
	public static void main(String[] args) {
// 		new ContactForm().render(new MaterialWidgetFactory());
		new ContactForm().render(new AntWidgetFactory());
	}
}
