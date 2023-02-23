package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.OrdersListDTO;

public class OrdersRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private OrdersListDTO result;
	
	public OrdersRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public OrdersListDTO getResult() {
		return result;
	}

	public void setResult(OrdersListDTO result) {
		this.result = result;
	}
}
