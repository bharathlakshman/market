package com.blaxman.market.rest.model.repo;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blaxman.market.rest.model.Customer;
import com.vividsolutions.jts.geom.Point;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {
	Collection<Customer> filterByRadius(Point centerPoint, double radiusInMeters);
}
