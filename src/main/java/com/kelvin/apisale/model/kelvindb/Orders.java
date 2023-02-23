package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="OrderID")
	private String OrderID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="CustomerID")
	private String CustomerID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="EmployeeID")
	private String EmployeeID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="OrderDate")
	private String OrderDate;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="ShipperID")
	private String ShipperID;

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
