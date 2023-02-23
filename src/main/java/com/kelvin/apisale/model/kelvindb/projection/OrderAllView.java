package com.kelvin.apisale.model.kelvindb.projection;

public interface OrderAllView {
	String getProductName();
	Integer getUnit();
	String getCustomerID();
	String getCustomerName();
	String getFullName();
	String getShipperName();
	String getOrderDate();
	Integer getTotal();
}
