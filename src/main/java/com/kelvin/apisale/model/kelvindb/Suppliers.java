package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Suppliers {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="SupplierID")
	private String SupplierID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="SupplierName")
	private String SupplierName;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="ContactName")
	private String ContactName;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="Address")
	private String Address;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="City")
	private String City;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="PostalCode")
	private String PostalCode;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="Country")
	private String Country;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="Phone")
	private String Phone;

	public String getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(String supplierID) {
		SupplierID = supplierID;
	}

	public String getSupplierName() {
		return SupplierName;
	}

	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
}
