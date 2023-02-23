package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.OrdersDTO;
import com.kelvin.apisale.dto.OrdersListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.IOrdersSvc;
import com.kelvin.apisale.model.kelvindb.projection.OrdersView;

@Service
public class OrdersSvc implements IOrdersSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public OrdersListDTO getListOrders() {
		// TODO Auto-generated method stub
		OrdersListDTO list = new OrdersListDTO();
        List<OrdersDTO> result = new ArrayList<>();
        List<OrdersView> listData = kelvinRepo.getListOrders();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	OrdersDTO data = new OrdersDTO();
            	
            	data.setCustomerID(listData.get(i).getCustomerID());
            	data.setEmployeeID(listData.get(i).getEmployeeID());
            	data.setOrderDate(listData.get(i).getOrderDate());
            	data.setOrderID(listData.get(i).getOrderID());
            	data.setShipperID(listData.get(i).getShipperID());
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
