package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.ShippersListDTO;
public class ShippersRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private ShippersListDTO result;
	
	public ShippersRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public ShippersListDTO getResult() {
		return result;
	}

	public void setResult(ShippersListDTO result) {
		this.result = result;
	}
}
