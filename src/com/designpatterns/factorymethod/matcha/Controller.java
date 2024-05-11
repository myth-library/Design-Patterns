package com.designpatterns.factorymethod.matcha;

import java.util.Map;

// This is the class that responds to user actions
// Base class for the all controllers
public class Controller {
	// Here is the method for rendering a view
	public void render(String viewName, Map<String, Object> context, ViewEngine engine) {
		var html = engine.render(viewName, context);
		System.out.println(html);
	}
}
