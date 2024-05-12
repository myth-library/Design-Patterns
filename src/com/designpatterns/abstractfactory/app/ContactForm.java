package com.designpatterns.abstractfactory.app;

import com.designpatterns.abstractfactory.Theme;
import com.designpatterns.abstractfactory.ant.AntButton;
import com.designpatterns.abstractfactory.ant.AntTextBox;
import com.designpatterns.abstractfactory.material.MaterialButton;
import com.designpatterns.abstractfactory.material.MaterialTextBox;

public class ContactForm {
	public void render(Theme theme) {
		if (theme == Theme.ANT) {
			new AntTextBox().render();
			new AntButton().render();
		}
		else if (theme == Theme.MATERIAL) {
			new MaterialTextBox().render();
			new MaterialButton().render();
		}
	}
}
