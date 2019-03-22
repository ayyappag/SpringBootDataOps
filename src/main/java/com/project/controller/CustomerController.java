package com.project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Customer;
import com.project.service.CustomerService;

@RestController
@RequestMapping(value = "/v1")
public class CustomerController {

	static Logger log = Logger.getLogger(CustomerController.class.getName());
	@Autowired
	private CustomerService service;

	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET, produces = "application/text")
	public ResponseEntity<String> healthCheck() {
		System.out.println("Execution : Health Check");
		log.info("Execution : Health Check");
		return new ResponseEntity<String>("Application Running", HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> creation(@RequestBody Customer customer) {
		log.info("Customer Creation");
		service.creation(customer);
		return new ResponseEntity<String>("Application Running", HttpStatus.OK);
	}

}
