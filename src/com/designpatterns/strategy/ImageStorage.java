package com.designpatterns.strategy;

public class ImageStorage {
	private ICompressor compressor;
	private IFilter filter;
	
	public ImageStorage(ICompressor compressor, IFilter filter) {
		this.compressor = compressor;
		this.filter = filter;
	}

	public void store(String fileName) {
		compressor.compress(fileName);
		filter.apply(fileName);
	}
}
