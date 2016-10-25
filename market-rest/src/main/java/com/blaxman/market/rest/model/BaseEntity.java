package com.blaxman.market.rest.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private Date createdOn;

	@NotNull
	private Date modifiedOn;

	@Transient
	public boolean isNew() {
		return (this.id == null);
	}

	@PrePersist
	public void initTimeStamps() {
		if (createdOn == null) {
			createdOn = new Date();
		}
		modifiedOn = createdOn;
	}

	@PreUpdate
	public void updateTimeStamp() {
		modifiedOn = new Date();
	}
}
