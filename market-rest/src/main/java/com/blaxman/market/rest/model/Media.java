package com.blaxman.market.rest.model;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Media extends BaseEntity {

	@Nonnull
	private String key;

	@Nonnull
	@Enumerated(EnumType.STRING)
	private Type type;

	public enum Type {
		IMAGE, VIDEO
	}
}
