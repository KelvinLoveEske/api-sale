package com.kelvin.apisale.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kelvin.apisale.dto.ProductsListDTO;
public class ProductsRs extends BaseRs {
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private ProductsListDTO result;
	
	public ProductsRs() {
        super.setStatusCode("200");
        super.setMessage("Success");
    }

	public ProductsListDTO getResult() {
		return result;
	}

	public void setResult(ProductsListDTO result) {
		this.result = result;
	}
}