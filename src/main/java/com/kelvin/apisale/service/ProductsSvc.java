package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.ProductsDTO;
import com.kelvin.apisale.dto.ProductsListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.IProductsSvc;
import com.kelvin.apisale.model.kelvindb.projection.ProductsView;

@Service
public class ProductsSvc implements IProductsSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public ProductsListDTO getListProducts() {
		// TODO Auto-generated method stub
		ProductsListDTO list = new ProductsListDTO();
        List<ProductsDTO> result = new ArrayList<>();
        List<ProductsView> listData = kelvinRepo.getListProducts();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	ProductsDTO data = new ProductsDTO();
            	
            	data.setProductID(listData.get(i).getProductID());
            	data.setProductName(listData.get(i).getProductName());
            	data.setSupplierID(listData.get(i).getSupplierID());
            	data.setCategoryID(listData.get(i).getCategoryID());
            	data.setUnit(listData.get(i).getUnit());
            	data.setPrice(listData.get(i).getPrice());
                result.add(data);             
            }
            list.setData(result);
            return list;
        }else {
            list.setData(result);
            return list;
        }
	}

}
