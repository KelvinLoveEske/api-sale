package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.SuppliersDTO;
import com.kelvin.apisale.dto.SuppliersListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.ISuppliersSvc;
import com.kelvin.apisale.model.kelvindb.projection.SuppliersView;

@Service
public class SuppliersSvc implements ISuppliersSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public SuppliersListDTO getListSuppliers() {
		// TODO Auto-generated method stub
		SuppliersListDTO list = new SuppliersListDTO();
        List<SuppliersDTO> result = new ArrayList<>();
        List<SuppliersView> listData = kelvinRepo.getListSuppliers();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	SuppliersDTO data = new SuppliersDTO();
            	
            	data.setSupplierID(listData.get(i).getSupplierID());
            	data.setSupplierName(listData.get(i).getSupplierName());
            	data.setAddress(listData.get(i).getAddress());
            	data.setCity(listData.get(i).getCity());
            	data.setContactName(listData.get(i).getContactName());
            	data.setCountry(listData.get(i).getCountry());
            	data.setPhone(listData.get(i).getPhone());
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
