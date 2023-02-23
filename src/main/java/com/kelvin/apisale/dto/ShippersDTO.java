package com.kelvin.apisale.dto;

public class ShippersDTO {
	private String ShipperID;
	private String ShipperName;
	private String Phone;
	
	public ShippersDTO() {
		
	}

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
