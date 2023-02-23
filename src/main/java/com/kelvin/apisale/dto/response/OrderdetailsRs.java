package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.OrderdetailsListDTO;

public class OrderdetailsRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private OrderdetailsListDTO result;
	
	public OrderdetailsRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public OrderdetailsListDTO getResult() {
		return result;
	}

	public void setResult(OrderdetailsListDTO result) {
		this.result = result;
	}
}
