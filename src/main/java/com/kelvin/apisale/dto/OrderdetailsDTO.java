package com.kelvin.apisale.dto;

public class OrderdetailsDTO {
	private String OrderDetailID;
	private String OrderID;
	private String ProductID;
	private Integer Quantity;
	
	public OrderdetailsDTO() {
		
	}

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
