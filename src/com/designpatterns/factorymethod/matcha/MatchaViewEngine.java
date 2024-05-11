package com.designpatterns.factorymethod.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
	// render() method rendering a HTML view/template
	// context = data that we pass to the view for render
	@Override
	public String render(String viewName, Map<String, Object> context) {
		/* let's return a simple string instead of implementing 
		   an actual rendering algorithm */
		return "View rendered by Matcha"; 
	}
}
