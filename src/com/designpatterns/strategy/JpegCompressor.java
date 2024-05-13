package com.designpatterns.strategy;

public class JpegCompressor implements ICompressor {
	@Override
	public void compress(String fileName) {
		System.out.println("Compressing using JPEG");
	}
}
