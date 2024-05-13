package com.designpatterns.strategy;

public class BlackAndWhiteFilter implements IFilter {
	@Override
	public void apply(String fileName) {
		System.out.println("Applying B&W filter");
	}
}
