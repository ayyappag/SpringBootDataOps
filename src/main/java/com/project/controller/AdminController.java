package com.project.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class AdminController {

	static Logger log = Logger.getLogger(AdminController.class.getName());

	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET, produces = "application/text")
	public ResponseEntity<String> healthCheck() {
		System.out.println("Execution : Health Check");
		log.info("Execution : Health Check");
		return new ResponseEntity<String>("Application Running", HttpStatus.ACCEPTED);
	}

}
