package com.designpatterns.factorymethod.sharp;

import com.designpatterns.factorymethod.matcha.Controller;
import com.designpatterns.factorymethod.matcha.ViewEngine;

public class SharpController extends Controller {
	@Override
	protected ViewEngine createViewEngine() {
		return new SharpViewEngine();
	}
}
