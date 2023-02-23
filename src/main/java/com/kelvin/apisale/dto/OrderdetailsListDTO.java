package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailsListDTO {
	private List<OrderdetailsDTO> data = new ArrayList<>();

	public List<OrderdetailsDTO> getData() {
		return data;
	}

	public void setData(List<OrderdetailsDTO> data) {
		this.data = data;
	}
}
