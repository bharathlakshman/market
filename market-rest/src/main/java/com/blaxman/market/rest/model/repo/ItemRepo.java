package com.blaxman.market.rest.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blaxman.market.rest.model.Item;

@Repository
public interface ItemRepo extends CrudRepository<Item, Long> {

}
