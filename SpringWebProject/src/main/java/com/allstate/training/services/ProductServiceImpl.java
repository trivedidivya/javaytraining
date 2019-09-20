package com.allstate.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.dao.ProductDao;
import com.allstate.training.entities.Product;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	public void addProduct(Product p) {
	if(p.getBrand().matches("[a-zA-Z]{4,}")) 
	{
		productDao.addProduct(p);
		
	}
	else 
	{
		throw  new RuntimeException("brand is not available");
	}	
	}

	public void updateProductCost(int cost, int pid) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
	}

	public Product getProductById() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getProducts() {
	List<Product> products=productDao.getProducts();
	if(!products.isEmpty())
	{
		return products;
	}
	else
		throw new RuntimeException("no products available");

	}

	public List<Product> getProductsByBrand(String brand) {
		List<Product> products=productDao.getProductsByBrand(brand);
		if(!products.isEmpty())
		{
			return products;
		}
		else
			throw new RuntimeException("no products available with this brand");

	}

}
