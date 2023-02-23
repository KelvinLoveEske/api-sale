package com.kelvin.apisale.irepository.kelvindb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kelvin.apisale.model.kelvindb.Categories;
import com.kelvin.apisale.model.kelvindb.projection.CategoriesView;
import com.kelvin.apisale.model.kelvindb.projection.CustomersView;
import com.kelvin.apisale.model.kelvindb.projection.EmployeesView;
import com.kelvin.apisale.model.kelvindb.projection.OrderAllView;
import com.kelvin.apisale.model.kelvindb.projection.OrderdetailsView;
import com.kelvin.apisale.model.kelvindb.projection.OrdersView;
import com.kelvin.apisale.model.kelvindb.projection.ProductsView;
import com.kelvin.apisale.model.kelvindb.projection.ShippersView;
import com.kelvin.apisale.model.kelvindb.projection.SuppliersView;

@Repository
public interface KelvinRepo extends JpaRepository<Categories, String> {
	@Query(value = "SELECT * FROM categories", nativeQuery = true)
    public List<CategoriesView> getListCategories();
	
	@Query(value = "SELECT * FROM customers", nativeQuery = true)
    public List<CustomersView> getListCustomers();
	
	@Query(value = "SELECT * FROM employees", nativeQuery = true)
    public List<EmployeesView> getListEmployees();
	
	@Query(value = "SELECT * FROM orderdetails", nativeQuery = true)
    public List<OrderdetailsView> getListOrderdetails();
	
	@Query(value = "SELECT * FROM orders", nativeQuery = true)
    public List<OrdersView> getListOrders();
	
	@Query(value = "SELECT * FROM products", nativeQuery = true)
    public List<ProductsView> getListProducts();
	
	@Query(value = "SELECT * FROM shippers", nativeQuery = true)
    public List<ShippersView> getListShippers();
	
	@Query(value = "SELECT * FROM suppliers", nativeQuery = true)
    public List<SuppliersView> getListSuppliers();
	
	@Query(value = "select c.ProductName, sum(a.Quantity) as Unit, d.CustomerID,d.CustomerName as CustomerName, CONCAT(e.FirstName, \" \", e.LastName) AS FullName, f.ShipperName as ShipperName, "
			+ "b.OrderDate as OrderDate, (c.price * sum(a.Quantity)) as Total from orderdetails a "
			+ "inner join products c on c.ProductID =a.ProductID "
			+ "inner join orders b on b.OrderID =a.OrderID "
			+ "inner join customers d on d.CustomerID = b.CustomerID "
			+ "inner join employees e on e.EmployeeID = b.EmployeeID "
			+ "inner join shippers f on f.ShipperID = b.ShipperID "
			+ "group by d.CustomerID,d.CustomerName,c.ProductName,e.LastName,e.FirstName,f.ShipperName,b.OrderDate, c.Price "
			+ "order by d.CustomerID asc", nativeQuery = true)
    public List<OrderAllView> getListOrderAll();
    
	
}
