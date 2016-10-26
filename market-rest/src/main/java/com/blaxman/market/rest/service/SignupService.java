package com.blaxman.market.rest.service;

import com.blaxman.market.rest.model.Customer;

public interface SignupService extends BaseService {

	void create(Customer customer);
}
