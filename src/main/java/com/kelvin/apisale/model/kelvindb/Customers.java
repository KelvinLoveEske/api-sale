package com.kelvin.apisale.model.kelvindb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {
	@Id
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="CustomerID")
	private String CustomerID;
	
	@Column(nullable = true,columnDefinition = "varchar(100)",name ="CustomerName")
	private String CustomerName;
	
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
	
}
