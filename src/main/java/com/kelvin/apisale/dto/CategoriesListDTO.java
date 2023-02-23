package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;
public class CategoriesListDTO {
	private List<CategoriesDTO> data = new ArrayList<>();

	public List<CategoriesDTO> getData() {
		return data;
	}

	public void setData(List<CategoriesDTO> data) {
		this.data = data;
	}
	 
}
