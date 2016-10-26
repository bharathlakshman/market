package com.blaxman.market.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blaxman.market.rest.model.Customer;
import com.blaxman.market.rest.service.SignupService;

@RestController
public class LoginController {

	@Autowired
	private SignupService signupService;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	private Boolean signup(@RequestBody Customer customer) {
		signupService.create(customer);
		return true;
	}

	/*
	 * private void signin() {
	 * 
	 * }
	 * 
	 * private void signout() {
	 * 
	 * }
	 */
}
