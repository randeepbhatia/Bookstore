package com.tsystems.bookstore.persistence.entity;
// Generated 26.03.2013 20:03:54 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Warehouse generated by hbm2java
 */
@Entity
@Table(name = "warehouse")
public class Warehouse implements java.io.Serializable {

	private int w_id;
	private String addressLine;
	private String telephone1;
	private String telephone2;
	private Set<Stockitem> stockitems = new HashSet<Stockitem>(0);

	public Warehouse() {
	}

	public Warehouse(int id, String addressLine) {
		this.w_id = id;
		this.addressLine = addressLine;
	}

	public Warehouse(int id, String addressLine, String telephone1,
			String telephone2, Set<Stockitem> stockitems) {
		this.w_id = id;
		this.addressLine = addressLine;
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.stockitems = stockitems;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 8, scale = 0)
	public int getId() {
		return this.w_id;
	}

	public void setId(int id) {
		this.w_id = id;
	}

	@Column(name = "addressLine", nullable = false, length = 200)
	public String getAddressLine() {
		return this.addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	@Column(name = "telephone1", length = 30)
	public String getTelephone1() {
		return this.telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	@Column(name = "telephone2", length = 30)
	public String getTelephone2() {
		return this.telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
	public Set<Stockitem> getStockitems() {
		return this.stockitems;
	}

	public void setStockitems(Set<Stockitem> stockitems) {
		this.stockitems = stockitems;
	}

}