package com.designpatterns.abstractfactory.material;

import com.designpatterns.abstractfactory.IButton;

public class MaterialButton implements IButton {
	@Override
	public void render() {
		System.out.println("Material Button");
	}
}
