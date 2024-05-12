package com.designpatterns.bridge;

public class SamsungTV implements IDevice {
	@Override
	public void turnOn() {
		System.out.println("Samsung: turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("Samsung: turnOff");
	}

	@Override
	public void setChannel(int number) {
		System.out.println("Samsung: setChannel");
	}
}
    