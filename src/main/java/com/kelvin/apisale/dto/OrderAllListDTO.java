package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;
public class OrderAllListDTO {
	private List<OrderAllDTO> data = new ArrayList<>();

	public List<OrderAllDTO> getData() {
		return data;
	}

	public void setData(List<OrderAllDTO> data) {
		this.data = data;
	}
}
