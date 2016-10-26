package com.blaxman.market.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blaxman.market.rest.model.Item;
import com.blaxman.market.rest.service.ItemService;

@RestController("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public void create(@RequestBody Item item) {
		itemService.create(item);
	}
}
