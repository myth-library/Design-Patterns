package com.designpatterns.bridge;

/*
 Let's assume we have different types of remote controllers,
 
 1) Basic remote control (turnOn, turnOff)
 2) Advanced remote control (setChannel) 
 3) Movie remote control (play, pause, rewind) */

public class RemoteControl {
	protected IDevice device;
	
	public RemoteControl(IDevice device) {
		this.device = device;
	}

	public void turnOn() {
		device.turnOn();
	}
	
	public void turnOff() {
		device.turnOff();
	}
}
