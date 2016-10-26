package com.blaxman.market.rest.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Item extends BaseEntity {

	private String name;
	private String description;
	private float cost;

	@NotNull
	@OneToMany(cascade = CascadeType.ALL)
	@Singular("media")
	private Collection<Media> media = new ArrayList<>();
}
