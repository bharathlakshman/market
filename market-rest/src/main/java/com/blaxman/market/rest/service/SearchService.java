package com.blaxman.market.rest.service;

import java.util.List;

import com.blaxman.market.rest.model.Item;
import com.blaxman.market.rest.service.message.Response;

public interface SearchService extends BaseService {

	Response<List<Item>> search(String query);
}
