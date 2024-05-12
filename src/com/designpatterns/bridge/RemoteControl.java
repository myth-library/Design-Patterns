package com.designpatterns.bridge;

/*
 Let's assume we have different types of remote controllers,
 
 1) Basic remote control (turnOn, turnOff)
 2) Advanced remote control (setChannel) 
 3) Movie remote control (play, pause, rewind) */

public abstract class RemoteControl {
	public abstract void turnOn();
	
	public abstract void turnOff();
}
