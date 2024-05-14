package com.designpatterns;

import com.designpatterns.command.AddCustomerCommand;
import com.designpatterns.command.CustomerService;
import com.designpatterns.command.fx.Button;

public class Main {
	public static void main(String[] args) {
		var service = new CustomerService();
		var command = new AddCustomerCommand(service);
		var button = new Button(command);
		button.click();
	}
}
