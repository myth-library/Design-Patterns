package com.designpatterns;

import com.designpatterns.strategy.ImageStorage;
import com.designpatterns.strategy.BlackAndWhiteFilter;
import com.designpatterns.strategy.HighContrastFilter;
import com.designpatterns.strategy.JpegCompressor;
import com.designpatterns.strategy.PngCompressor;

public class Main {
	public static void main(String[] args) {
		var imageStorage = new ImageStorage();
		
		imageStorage.store("sample_name", new PngCompressor(), new BlackAndWhiteFilter());
		imageStorage.store("sample_name", new JpegCompressor(), new HighContrastFilter());
	}
}
