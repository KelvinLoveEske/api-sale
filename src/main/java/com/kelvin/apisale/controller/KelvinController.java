package com.kelvin.apisale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelvin.apisale.dto.CategoriesListDTO;
import com.kelvin.apisale.dto.CustomersListDTO;
import com.kelvin.apisale.dto.EmployeesListDTO;
import com.kelvin.apisale.dto.OrderAllListDTO;
import com.kelvin.apisale.dto.OrderdetailsListDTO;
import com.kelvin.apisale.dto.OrdersListDTO;
import com.kelvin.apisale.dto.ProductsListDTO;
import com.kelvin.apisale.dto.ShippersListDTO;
import com.kelvin.apisale.dto.SuppliersListDTO;
import com.kelvin.apisale.dto.response.CategoriesRs;
import com.kelvin.apisale.dto.response.CustomersRs;
import com.kelvin.apisale.dto.response.EmployeesRs;
import com.kelvin.apisale.dto.response.OrderAllRs;
import com.kelvin.apisale.dto.response.OrderdetailsRs;
import com.kelvin.apisale.dto.response.OrdersRs;
import com.kelvin.apisale.dto.response.ProductsRs;
import com.kelvin.apisale.dto.response.ShippersRs;
import com.kelvin.apisale.dto.response.SuppliersRs;
import com.kelvin.apisale.iservice.ICategoriesSvc;
import com.kelvin.apisale.iservice.ICustomersSvc;
import com.kelvin.apisale.iservice.IEmployeesSvc;
import com.kelvin.apisale.iservice.IOrderAllSvc;
import com.kelvin.apisale.iservice.IOrderdetailsSvc;
import com.kelvin.apisale.iservice.IOrdersSvc;
import com.kelvin.apisale.iservice.IProductsSvc;
import com.kelvin.apisale.iservice.IShippersSvc;
import com.kelvin.apisale.iservice.ISuppliersSvc;

@RestController
@RequestMapping(value = "/api/v1/")
public class KelvinController {
	@Autowired
	private ICategoriesSvc iCategoriesSvc;
	@Autowired
	private ICustomersSvc iCustomersSvc;
	@Autowired
	private IEmployeesSvc iEmployeesSvc;
	@Autowired
	private IOrderdetailsSvc iOrderdetailsSvc;
	@Autowired
	private IOrdersSvc iOrdersSvc;
	@Autowired
	private IProductsSvc iProductsSvc;
	@Autowired
	private IShippersSvc iShippersSvc;
	@Autowired
	private ISuppliersSvc iSuppliersSvc;
	@Autowired
	private IOrderAllSvc iOrderAllSvc;
	
	@GetMapping(value = "getListCategories")
	public CategoriesRs getListCategories(){
		CategoriesRs rs = new CategoriesRs();
		CategoriesListDTO rq =  iCategoriesSvc.getListCategories();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListCustomers")
	public CustomersRs getListCustomers(){
		CustomersRs rs = new CustomersRs();
		CustomersListDTO rq =  iCustomersSvc.getListCustomers();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListEmployees")
	public EmployeesRs getListEmployees(){
		EmployeesRs rs = new EmployeesRs();
		EmployeesListDTO rq =  iEmployeesSvc.getListEmployees();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListOrderdetails")
	public OrderdetailsRs getListOrderdetails(){
		OrderdetailsRs rs = new OrderdetailsRs();
		OrderdetailsListDTO rq =  iOrderdetailsSvc.getListOrderdetails();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListOrders")
	public OrdersRs getListOrders(){
		OrdersRs rs = new OrdersRs();
		OrdersListDTO rq =  iOrdersSvc.getListOrders();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListProducts")
	public ProductsRs getListProducts(){
		ProductsRs rs = new ProductsRs();
		ProductsListDTO rq =  iProductsSvc.getListProducts();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListShippers")
	public ShippersRs getListShippers(){
		ShippersRs rs = new ShippersRs();
		ShippersListDTO rq =  iShippersSvc.getListShippers();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListSuppliers")
	public SuppliersRs getListSuppliers(){
		SuppliersRs rs = new SuppliersRs();
		SuppliersListDTO rq =  iSuppliersSvc.getListSuppliers();
		rs.setResult(rq);
        return rs;
    }
	
	@GetMapping(value = "getListOrderAll")
	public OrderAllRs getListOrderAll(){
		OrderAllRs rs = new OrderAllRs();
		OrderAllListDTO rq =  iOrderAllSvc.getListOrderAll();
		rs.setResult(rq);
        return rs;
    }
	
}
