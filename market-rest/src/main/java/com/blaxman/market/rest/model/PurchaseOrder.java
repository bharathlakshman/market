package com.blaxman.market.rest.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper = true, exclude = { "customer" })
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
