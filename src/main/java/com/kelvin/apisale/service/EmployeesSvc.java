package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.EmployeesDTO;
import com.kelvin.apisale.dto.EmployeesListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.IEmployeesSvc;
import com.kelvin.apisale.model.kelvindb.projection.EmployeesView;

@Service
public class EmployeesSvc implements IEmployeesSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public EmployeesListDTO getListEmployees() {
		// TODO Auto-generated method stub
		EmployeesListDTO list = new EmployeesListDTO();
        List<EmployeesDTO> result = new ArrayList<>();
        List<EmployeesView> listData = kelvinRepo.getListEmployees();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	EmployeesDTO data = new EmployeesDTO();
            	
            	data.setEmployeeID(listData.get(i).getEmployeeID());
            	data.setFirstName(listData.get(i).getFirstName());
            	data.setLastName(listData.get(i).getLastName());
            	data.setBirthDate(listData.get(i).getBirthDate());
            	data.setNotes(listData.get(i).getNotes());
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
