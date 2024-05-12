package com.designpatterns.bridge;

public class SonyRemoteControl extends RemoteControl {
	@Override
	public void turnOn() {
		/* Actual implementation should be a 3rd party library provided by 
		   Sony to talk to a Sony TV */
		System.out.println("Sony: turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("Sony: turnOff");
	}
}
