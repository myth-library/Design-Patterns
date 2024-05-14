package com.designpatterns.command;

import com.designpatterns.command.fx.ICommand;

public class AddCustomerCommand implements ICommand {
	private CustomerService service;
	
	public AddCustomerCommand(CustomerService service) {
		this.service = service;
	}

	@Override
	public void execute() {
		service.addCustomer();
	}
}
