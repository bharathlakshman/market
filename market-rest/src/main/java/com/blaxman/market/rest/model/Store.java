package com.blaxman.market.rest.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false, exclude={ "customer" })
@ToString(callSuper = true, exclude = { "customer" })
public class Store extends BaseEntity {

	@NotNull
	@Nonnull
	private String name;

	@NotNull
	@Nonnull
	private String description;

	@OneToMany(cascade = CascadeType.ALL)
	@Singular("media")
	private Collection<Media> media = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL)
	@Singular
	private Collection<Item> items = new ArrayList<>();

	@NotNull
	@Nonnull
	@ManyToOne
	private Customer customer;
}
