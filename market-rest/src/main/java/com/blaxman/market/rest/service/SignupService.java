package com.blaxman.market.rest.service;

import com.blaxman.market.rest.model.Customer;
import com.blaxman.market.rest.service.message.Response;

public interface SignupService extends BaseService {

	Response<Customer> create(Customer customer);
}
