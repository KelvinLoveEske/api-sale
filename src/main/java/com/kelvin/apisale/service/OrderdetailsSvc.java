package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.OrderdetailsDTO;
import com.kelvin.apisale.dto.OrderdetailsListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.IOrderdetailsSvc;
import com.kelvin.apisale.model.kelvindb.projection.OrderdetailsView;

@Service
public class OrderdetailsSvc implements IOrderdetailsSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public OrderdetailsListDTO getListOrderdetails() {
		// TODO Auto-generated method stub
		OrderdetailsListDTO list = new OrderdetailsListDTO();
        List<OrderdetailsDTO> result = new ArrayList<>();
        List<OrderdetailsView> listData = kelvinRepo.getListOrderdetails();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	OrderdetailsDTO data = new OrderdetailsDTO();
            	
            	data.setOrderDetailID(listData.get(i).getOrderDetailID());
            	data.setOrderID(listData.get(i).getOrderID());
            	data.setProductID(listData.get(i).getProductID());
            	data.setQuantity(listData.get(i).getQuantity());
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
