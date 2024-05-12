package com.designpatterns.abstractfactory.material;

import com.designpatterns.abstractfactory.ITextBox;

public class MaterialTextBox implements ITextBox {
	@Override
	public void render() {
		System.out.println("Material TextBox");
	}
}
