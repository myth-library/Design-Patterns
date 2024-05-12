package com.designpatterns.abstractfactory.ant;

import com.designpatterns.abstractfactory.IButton;

public class AntButton implements IButton {
	@Override
	public void render() {
		System.out.println("Ant Button");
	}
}
