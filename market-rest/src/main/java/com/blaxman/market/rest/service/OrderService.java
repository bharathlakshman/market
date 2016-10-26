package com.blaxman.market.rest.service;

import java.util.Date;

import com.blaxman.market.rest.model.PurchaseOrder;

public interface OrderService extends BaseService {

	void place(PurchaseOrder purchaseOrder);

	void cancel(Long orderId);

	void track(Long orderId);

	void history(Long customerId, Date from, Date to);
}
