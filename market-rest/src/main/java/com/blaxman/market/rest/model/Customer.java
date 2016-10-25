package com.blaxman.market.rest.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.PrecisionModel;

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
@NamedQuery(name = "Customer.filterByRadius", query = "select c from Customer c where dwithin(c.geography, ?1, ?2) = true")
public class Customer extends BaseEntity {

	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	@NotNull
	@Email
	private String email;

	@NotNull
	private String address;

	@NotNull
	private String mobile;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="customer")
	private Collection<PurchaseOrder> orders = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="customer")
	private Collection<Store> stores = new ArrayList<>();

	@NotNull
	private Double lat;

	@NotNull
	private Double lon;

	@NotNull
	@Column(columnDefinition = "geography(Point,4326)")
	private Point geography;

	@PrePersist
	private void updateGeoLocation() {
		GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
		this.geography = geometryFactory.createPoint(new Coordinate(lon, lat));
	}
}
