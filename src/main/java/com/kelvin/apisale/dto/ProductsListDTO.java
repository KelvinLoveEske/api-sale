package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;
public class ProductsListDTO {
	private List<ProductsDTO> data = new ArrayList<>();

	public List<ProductsDTO> getData() {
		return data;
	}

	public void setData(List<ProductsDTO> data) {
		this.data = data;
	}
}
