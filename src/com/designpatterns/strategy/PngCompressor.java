package com.designpatterns.strategy;

public class PngCompressor implements ICompressor {
	@Override
	public void compress(String fileName) {
		System.out.println("Compressing using PNG");
	}
}
