package com.blaxman.market.rest.service.impl;

import javax.annotation.Nonnull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blaxman.market.rest.model.Customer;
import com.blaxman.market.rest.model.repo.CustomerRepo;
import com.blaxman.market.rest.service.SignupService;
import com.blaxman.market.rest.service.message.Response;

@Service
public class SignupServiceImpl implements SignupService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Response<Customer> create(@Nonnull Customer customer) {
		customerRepo.save(customer);
		return new Response<>(customer);
	}
}
