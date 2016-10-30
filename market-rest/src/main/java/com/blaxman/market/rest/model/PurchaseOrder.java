package com.blaxman.market.rest.model;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, exclude = { "customer" })
public class PurchaseOrder extends BaseEntity {

	@Nonnull
	@NotNull
	private Double cost;

	@Nonnull
	@NotNull
	private String deliveryStatus;

	@Nonnull
	@NotNull
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
