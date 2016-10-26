package com.blaxman.market.rest.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.blaxman.market.rest.model.Item;
import com.blaxman.market.rest.model.repo.ItemRepo;
import com.blaxman.market.rest.service.ItemService;

public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepo itemRepo;

	@Override
	public void create(Item item) {
		checkNotNull(item);
		itemRepo.save(item);
	}

}
