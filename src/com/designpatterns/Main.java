package com.designpatterns;

import com.designpatterns.bridge.AdvancedRemoteControl;
import com.designpatterns.bridge.RemoteControl;
import com.designpatterns.bridge.SamsungTV;
import com.designpatterns.bridge.SonyTV;

public class Main {
	public static void main(String[] args) {
//		var remoteControl = new RemoteControl(new SonyTV());
		var remoteControl = new AdvancedRemoteControl(new SonyTV());
		remoteControl.turnOn();
		
//		var remoteControl = new AdvancedRemoteControl(new SamsungTV());
//		remoteControl.turnOn();
	}
}
