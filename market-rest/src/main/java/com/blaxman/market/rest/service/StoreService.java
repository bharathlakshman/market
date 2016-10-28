package com.blaxman.market.rest.service;

import com.blaxman.market.rest.model.Store;
import com.blaxman.market.rest.service.message.Response;

public interface StoreService extends BaseService {

	Response<Store> create(Store store);
}
