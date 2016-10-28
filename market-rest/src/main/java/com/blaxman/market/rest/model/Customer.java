package com.blaxman.market.rest.model;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.validator.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.PrecisionModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, exclude = { "stores", "orders" })
@NamedQuery(name = "Customer.filterByRadius", query = "select c from Customer c where dwithin(c.geography, ?1, ?2) = true")
public class Customer extends BaseEntity {

	@Nonnull
	private String firstName;

	@Nonnull
	private String lastName;

	@Nonnull
	@Email
	private String email;

	@NonNull
	private String address;

	@NonNull
	private String mobile;

	@OneToOne(cascade = CascadeType.ALL)
	private Media picture;

	@NonNull
	private Double lat;

	@NonNull
	private Double lon;

	@JsonIgnore
	@Column(columnDefinition = "geography(Point,4326)")
	private Point geography;

	@Singular
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private Collection<PurchaseOrder> orders = new ArrayList<>();

	@Singular
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private Collection<Store> stores = new ArrayList<>();

	@PreUpdate
	@PrePersist
	private void updateGeoLocation() {
		checkNotNull(lat);
		checkNotNull(lon);
		GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
		geography = geometryFactory.createPoint(new Coordinate(lon, lat));
	}
}
