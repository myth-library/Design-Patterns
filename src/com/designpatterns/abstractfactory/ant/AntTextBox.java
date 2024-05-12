package com.designpatterns.abstractfactory.ant;

import com.designpatterns.abstractfactory.ITextBox;

public class AntTextBox implements ITextBox {
	@Override
	public void render() {
		System.out.println("Ant TextBox");
	}
}
