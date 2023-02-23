package com.kelvin.apisale.dto;

import java.util.ArrayList;
import java.util.List;

public class EmployeesListDTO {
	private List<EmployeesDTO> data = new ArrayList<>();

	public List<EmployeesDTO> getData() {
		return data;
	}

	public void setData(List<EmployeesDTO> data) {
		this.data = data;
	}
}
