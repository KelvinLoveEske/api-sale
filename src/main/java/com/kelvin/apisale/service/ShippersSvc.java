package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.ShippersDTO;
import com.kelvin.apisale.dto.ShippersListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.IShippersSvc;
import com.kelvin.apisale.model.kelvindb.projection.ShippersView;

@Service
public class ShippersSvc implements IShippersSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public ShippersListDTO getListShippers() {
		// TODO Auto-generated method stub
		ShippersListDTO list = new ShippersListDTO();
        List<ShippersDTO> result = new ArrayList<>();
        List<ShippersView> listData = kelvinRepo.getListShippers();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	ShippersDTO data = new ShippersDTO();
            	
            	data.setShipperID(listData.get(i).getShipperID());
            	data.setShipperName(listData.get(i).getShipperName());
            	data.setPhone(listData.get(i).getPhone());
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
