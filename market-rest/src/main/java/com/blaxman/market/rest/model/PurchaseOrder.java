package com.blaxman.market.rest.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder extends BaseEntity {

	@NotNull
	private double cost;

	@NotNull
	private String deliveryStatus;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
