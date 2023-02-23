package com.kelvin.apisale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.kelvin.apisale.dto.CategoriesDTO;
import com.kelvin.apisale.dto.CategoriesListDTO;
import com.kelvin.apisale.irepository.kelvindb.KelvinRepo;
import com.kelvin.apisale.iservice.ICategoriesSvc;
import com.kelvin.apisale.model.kelvindb.projection.CategoriesView;

@Service
public class CategoriesSvc implements ICategoriesSvc {
	@Autowired
	KelvinRepo kelvinRepo;
	
	@Override
	public CategoriesListDTO getListCategories() {
		// TODO Auto-generated method stub
		CategoriesListDTO list = new CategoriesListDTO();
        List<CategoriesDTO> result = new ArrayList<>();
        List<CategoriesView> listData = kelvinRepo.getListCategories();
        if(!listData.isEmpty()){
            for (int i = 0; i < listData.size(); i++) {
            	CategoriesDTO data = new CategoriesDTO();
                data.setCategoryID(listData.get(i).getCategoryID());
                data.setCategoryName(listData.get(i).getCategoryName());
                data.setDescription(listData.get(i).getDescription());
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
