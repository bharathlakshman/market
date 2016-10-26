package com.blaxman.market.rest.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blaxman.market.rest.model.Media;

@Repository
public interface MediaRepo extends CrudRepository<Media, Long> {

}
