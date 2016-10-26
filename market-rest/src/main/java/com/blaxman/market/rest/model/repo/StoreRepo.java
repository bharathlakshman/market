package com.blaxman.market.rest.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blaxman.market.rest.model.Store;

@Repository
public interface StoreRepo extends CrudRepository<Store, Long> {

}
