package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shippers")
public class Shippers {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="ShipperID")
	private String ShipperID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="ShipperName")
	private String ShipperName;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="Phone")
	private String Phone;

	public String getShipperID() {
		return ShipperID;
	}

	public void setShipperID(String shipperID) {
		ShipperID = shipperID;
	}

	public String getShipperName() {
		return ShipperName;
	}

	public void setShipperName(String shipperName) {
		ShipperName = shipperName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
}
