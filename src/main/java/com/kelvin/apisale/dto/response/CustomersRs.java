package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.CustomersListDTO;

public class CustomersRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private CustomersListDTO result;
	
	public CustomersRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public CustomersListDTO getResult() {
		return result;
	}

	public void setResult(CustomersListDTO result) {
		this.result = result;
	}
	
}
