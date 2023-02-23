package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;
public class CustomersListDTO {
	private List<CustomersDTO> data = new ArrayList<>();

	public List<CustomersDTO> getData() {
		return data;
	}

	public void setData(List<CustomersDTO> data) {
		this.data = data;
	}
}
