package com.designpatterns.factorymethod.sharp;

import java.util.Map;

import com.designpatterns.factorymethod.matcha.ViewEngine;

public class SharpViewEngine implements ViewEngine{
	@Override
	public String render(String viewName, Map<String, Object> context) {
		return "View rendered by Sharp view engine";
	}
	
}
