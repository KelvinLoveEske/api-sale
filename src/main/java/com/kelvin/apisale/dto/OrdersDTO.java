package com.kelvin.apisale.dto;

public class OrdersDTO {
	private String OrderID;
	private String CustomerID;
	private String EmployeeID;
	private String OrderDate;
	private String ShipperID;
	
	public OrdersDTO() {
		
	}

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	public String getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}

	public String getShipperID() {
		return ShipperID;
	}

	public void setShipperID(String shipperID) {
		ShipperID = shipperID;
	}
	
}
