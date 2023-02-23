package com.kelvin.apisale.dto;

public class ProductsDTO {
	private String ProductID;
	private String ProductName;
	private String SupplierID;
	private String CategoryID;
	private String Unit;
	private Double Price;
	
	public ProductsDTO() {
		
	}

	public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		ProductID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(String supplierID) {
		SupplierID = supplierID;
	}

	public String getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(String categoryID) {
		CategoryID = categoryID;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}
	
}
