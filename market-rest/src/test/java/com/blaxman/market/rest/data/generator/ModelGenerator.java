package com.blaxman.market.rest.data.generator;

import static com.blaxman.market.rest.data.generator.LocationUtil.getLatLon;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.blaxman.market.rest.AbstractTest;
import com.blaxman.market.rest.model.Customer;
import com.blaxman.market.rest.model.Item;
import com.blaxman.market.rest.model.Store;
import com.blaxman.market.rest.model.Store.StoreBuilder;
import com.blaxman.market.rest.model.repo.CustomerRepo;

public class ModelGenerator extends AbstractTest {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Test
	 public void createCustomers() {
		List<Customer> customers = new ArrayList<>();
		for (int i = 0; i < 5000; i++) {
			double[] location = getLatLon();
			Customer customer = new Customer(word(), word(), word() + "wow@gmail.com", word(), Math.random() + "", location[0], location[1]);
			StoreBuilder storeBuilder = Store.builder().description(word()).name(word());
			storeBuilder.item(Item.builder().cost((float) Math.random()).description(word()).name(word()).build());
			storeBuilder.item(Item.builder().cost((float) Math.random()).description(word()).name(word()).build());
			storeBuilder.item(Item.builder().cost((float) Math.random()).description(word()).name(word()).build());
			Store store = storeBuilder.customer(customer).build();
			customer.getStores().add(store);
			customers.add(customer);
		}
		customerRepo.save(customers);
	}

	private String word() {
		return RandomStringUtils.randomAlphabetic((int) Math.round(Math.random() * 10));
	}
}
