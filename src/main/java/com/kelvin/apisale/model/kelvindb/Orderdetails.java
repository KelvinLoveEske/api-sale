package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class Orderdetails {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="OrderDetailID")
	private String OrderDetailID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="OrderID")
	private String OrderID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="ProductID")
	private String ProductID;
	
	@Column(nullable = true,columnDefinition = "int(11)",name ="Quantity")
	private Integer Quantity;

	public String getOrderDetailID() {
		return OrderDetailID;
	}

	public void setOrderDetailID(String orderDetailID) {
		OrderDetailID = orderDetailID;
	}

	public String getOrderID() {
		return OrderID;
	}

	public void setOrderID(String orderID) {
		OrderID = orderID;
	}

	public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		ProductID = productID;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	
}
