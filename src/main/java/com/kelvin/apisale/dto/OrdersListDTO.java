package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;
public class OrdersListDTO {
	private List<OrdersDTO> data = new ArrayList<>();

	public List<OrdersDTO> getData() {
		return data;
	}

	public void setData(List<OrdersDTO> data) {
		this.data = data;
	}
}
