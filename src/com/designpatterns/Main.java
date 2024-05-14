package com.designpatterns;

import com.designpatterns.templatemethod.GenerateReportTask;
import com.designpatterns.templatemethod.TransferMoneyTask;

public class Main {
	public static void main(String[] args) {
		var task = new GenerateReportTask();
		task.execute();
	}
}
