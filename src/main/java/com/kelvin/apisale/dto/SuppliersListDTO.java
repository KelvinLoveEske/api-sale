package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;
public class SuppliersListDTO {
	private List<SuppliersDTO> data = new ArrayList<>();

	public List<SuppliersDTO> getData() {
		return data;
	}

	public void setData(List<SuppliersDTO> data) {
		this.data = data;
	}
}
