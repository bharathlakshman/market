package com.blaxman.market.rest.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.blaxman.market.rest.model.Store;
import com.blaxman.market.rest.model.repo.StoreRepo;
import com.blaxman.market.rest.service.StoreService;

public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreRepo storeRepo;

	@Override
	public void create(Store store) {
		checkNotNull(store);
		storeRepo.save(store);
	}

}
