package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.OrderAllListDTO;

public class OrderAllRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private OrderAllListDTO result;
	
	public OrderAllRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public OrderAllListDTO getResult() {
		return result;
	}

	public void setResult(OrderAllListDTO result) {
		this.result = result;
	}
}
