package com.blaxman.market.rest.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

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

	@NotNull
	private String key;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Type type;

	public enum Type {
		IMAGE, VIDEO
	}
}
