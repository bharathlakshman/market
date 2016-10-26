package com.blaxman.market.rest.service.impl;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blaxman.market.rest.model.Customer;
import com.blaxman.market.rest.model.repo.CustomerRepo;
import com.blaxman.market.rest.service.SignupService;

@Service
public class SignupServiceImpl implements SignupService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public void create(@NotNull Customer customer) {
		customerRepo.save(customer);
	}
}
