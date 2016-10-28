package com.blaxman.market.rest.service;

import com.blaxman.market.rest.model.Item;
import com.blaxman.market.rest.service.message.Response;

public interface ItemService extends BaseService {

	Response<Item> create(Item item);
}
