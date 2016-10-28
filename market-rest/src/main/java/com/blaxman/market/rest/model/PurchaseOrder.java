package com.blaxman.market.rest.model;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, exclude = { "customer" })
public class PurchaseOrder extends BaseEntity {

	@Nonnull
	private Double cost;

	@Nonnull
	private String deliveryStatus;

	@Nonnull
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
