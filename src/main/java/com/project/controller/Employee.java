package com.project.controller;

public class Employee {

	public String empData(int id) {
		if (id == 0)
			throw new IllegalArgumentException("Id should not be zero");
		if (id == 123)
			return "satyam";
		if (id == 456)
			return "ge";

		return String.valueOf(id);
	}

}
