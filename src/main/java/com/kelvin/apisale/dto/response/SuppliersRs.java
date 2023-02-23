package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.SuppliersListDTO;
public class SuppliersRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private SuppliersListDTO result;
	
	public SuppliersRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public SuppliersListDTO getResult() {
		return result;
	}

	public void setResult(SuppliersListDTO result) {
		this.result = result;
	}
}