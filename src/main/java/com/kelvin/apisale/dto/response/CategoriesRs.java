package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.CategoriesListDTO;

public class CategoriesRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private CategoriesListDTO result;
	
	public CategoriesRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public CategoriesListDTO getResult() {
		return result;
	}

	public void setResult(CategoriesListDTO result) {
		this.result = result;
	}
	
}
