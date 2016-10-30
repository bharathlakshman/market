package com.blaxman.market.rest.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blaxman.market.rest.model.PurchaseOrder;
import com.blaxman.market.rest.model.repo.PurchaseOrderRepo;
import com.blaxman.market.rest.service.OrderService;
import com.blaxman.market.rest.service.message.Response;

@Service
public abstract class OrderServiceImpl implements OrderService {

	@Autowired
	private PurchaseOrderRepo purchaseOrderRepo;

	@Override
	public Response<PurchaseOrder> order(PurchaseOrder purchaseOrder) {
		checkNotNull(purchaseOrder);
		PurchaseOrder savedPurcehaseOrder = purchaseOrderRepo.save(purchaseOrder);
		return new Response<>(savedPurcehaseOrder);
	}

}
