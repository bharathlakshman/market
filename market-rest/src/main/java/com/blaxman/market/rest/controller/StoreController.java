package com.blaxman.market.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blaxman.market.rest.model.Store;
import com.blaxman.market.rest.service.StoreService;

@RestController("/store")
public class StoreController {

	@Autowired
	private StoreService storeService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void create(@RequestBody Store store) {
		storeService.create(store);
	}
}
