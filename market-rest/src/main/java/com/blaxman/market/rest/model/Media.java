package com.blaxman.market.rest.model;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Builder
@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Media extends BaseEntity {

	@Nonnull
	@NotNull
	private String key;

	@Nonnull
	@NotNull
	@Enumerated(EnumType.STRING)
	private Type type;

	public enum Type {
		IMAGE, VIDEO
	}
}
