package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.EmployeesListDTO;

public class EmployeesRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private EmployeesListDTO result;
	
	public EmployeesRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public EmployeesListDTO getResult() {
		return result;
	}

	public void setResult(EmployeesListDTO result) {
		this.result = result;
	}
}
