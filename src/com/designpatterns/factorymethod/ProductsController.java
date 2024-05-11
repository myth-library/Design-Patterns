package com.designpatterns.factorymethod;

import java.util.HashMap;
import java.util.Map;

import com.designpatterns.factorymethod.matcha.Controller;
import com.designpatterns.factorymethod.matcha.MatchaViewEngine;
import com.designpatterns.factorymethod.sharp.SharpController;

// This class will use in framework to build product page
public class ProductsController extends Controller {
	// Here is the method for listing the products
	public void listProducts() {
		// In real-world application, get products from a database
		Map<String, Object> context = new HashMap<>();
		// context.put(products)
		render("products.html", context);
	}
} 
