package com.designpatterns;

import com.designpatterns.singleton.ConfigManager;

public class Main {
	public static void main(String[] args) {
		ConfigManager manager = ConfigManager.getInstance();
		manager.set("name", "Ashen");
//		System.out.println(manager.get("name"));
		
		ConfigManager other = ConfigManager.getInstance();
		System.out.println(other.get("name"));
	}
}
