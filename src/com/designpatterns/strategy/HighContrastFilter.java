package com.designpatterns.strategy;

public class HighContrastFilter implements IFilter {
	@Override
	public void apply(String fileName) {
		System.out.println("Applying high contrast filter");
	}
}
  