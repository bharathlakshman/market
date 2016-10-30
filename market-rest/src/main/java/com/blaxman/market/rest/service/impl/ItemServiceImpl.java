package com.blaxman.market.rest.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blaxman.market.rest.model.Item;
import com.blaxman.market.rest.model.repo.ItemRepo;
import com.blaxman.market.rest.service.ItemService;
import com.blaxman.market.rest.service.message.Response;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepo itemRepo;

	@Override
	public Response<Item> create(Item item) {
		checkNotNull(item);
		itemRepo.save(item);
		return new Response<>(item);
	}

}
