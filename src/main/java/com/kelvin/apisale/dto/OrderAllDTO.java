package com.kelvin.apisale.dto;

public class OrderAllDTO {
	private String ProductName;
	private Integer Unit;
	private String CustomerID;
	private String CustomerName;
	private String FullName;
	private String ShipperName;
	private String OrderDate;
	private Integer Total;
	
	public OrderAllDTO() {
		
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public Integer getUnit() {
		return Unit;
	}

	public void setUnit(Integer unit) {
		Unit = unit;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getShipperName() {
		return ShipperName;
	}

	public void setShipperName(String shipperName) {
		ShipperName = shipperName;
	}

	public String getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}

	public Integer getTotal() {
		return Total;
	}

	public void setTotal(Integer total) {
		Total = total;
	}
	
}
