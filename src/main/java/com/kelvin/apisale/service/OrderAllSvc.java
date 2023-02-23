package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.OrderAllDTO;
import com.kelvin.apisale.dto.OrderAllListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.IOrderAllSvc;
import com.kelvin.apisale.model.kelvindb.projection.OrderAllView;

@Service
public class OrderAllSvc implements IOrderAllSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public OrderAllListDTO getListOrderAll() {
		// TODO Auto-generated method stub
		OrderAllListDTO list = new OrderAllListDTO();
        List<OrderAllDTO> result = new ArrayList<>();
        List<OrderAllView> listData = kelvinRepo.getListOrderAll();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	OrderAllDTO data = new OrderAllDTO();
            	
            	data.setCustomerID(listData.get(i).getCustomerID());
            	data.setCustomerName(listData.get(i).getCustomerName());
            	data.setFullName(listData.get(i).getFullName());
            	data.setOrderDate(listData.get(i).getOrderDate());
            	data.setProductName(listData.get(i).getProductName());
            	data.setShipperName(listData.get(i).getShipperName());
            	data.setUnit(listData.get(i).getUnit());
            	data.setTotal(listData.get(i).getTotal());
            	
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
