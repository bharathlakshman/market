package com.blaxman.market.rest.service;

import java.util.Date;
import java.util.List;

import com.blaxman.market.rest.model.PurchaseOrder;
import com.blaxman.market.rest.service.message.Response;

public interface OrderService extends BaseService {

	Response<PurchaseOrder> order(PurchaseOrder purchaseOrder);

	Response<Boolean> cancel(Long orderId);

	Response<PurchaseOrder> track(Long orderId);

	Response<List<PurchaseOrder>> history(Long customerId, Date from, Date to);
}
