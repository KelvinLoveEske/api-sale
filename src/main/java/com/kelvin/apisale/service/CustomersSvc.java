package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.CustomersDTO;
import com.kelvin.apisale.dto.CustomersListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.ICustomersSvc;
import com.kelvin.apisale.model.kelvindb.projection.CustomersView;

@Service
public class CustomersSvc implements ICustomersSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public CustomersListDTO getListCustomers() {
		// TODO Auto-generated method stub
		CustomersListDTO list = new CustomersListDTO();
        List<CustomersDTO> result = new ArrayList<>();
        List<CustomersView> listData = kelvinRepo.getListCustomers();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	CustomersDTO data = new CustomersDTO();
            	data.setAddress(listData.get(i).getAddress());
            	data.setCity(listData.get(i).getCity());
            	data.setContactName(listData.get(i).getContactName());
            	data.setCountry(listData.get(i).getCountry());
            	data.setCustomerID(listData.get(i).getCustomerID());
            	data.setCustomerName(listData.get(i).getCustomerName());
            	data.setPostalCode(listData.get(i).getPostalCode());
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
