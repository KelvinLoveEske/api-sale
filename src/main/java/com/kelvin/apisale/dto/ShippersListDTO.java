package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;
public class ShippersListDTO {
	private List<ShippersDTO> data = new ArrayList<>();

	public List<ShippersDTO> getData() {
		return data;
	}

	public void setData(List<ShippersDTO> data) {
		this.data = data;
	}
}
