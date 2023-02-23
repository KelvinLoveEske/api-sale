package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="ProductID")
	private String ProductID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="ProductName")
	private String ProductName;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="SupplierID")
	private String SupplierID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="CategoryID")
	private String CategoryID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="Unit")
	private String Unit;
	
	@Column(nullable = true,columnDefinition = "double",name ="Price")
	private Double Price;

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
