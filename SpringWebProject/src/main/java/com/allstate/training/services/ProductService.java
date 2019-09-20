package com.allstate.training.services;

import java.util.List;

import com.allstate.training.entities.Product;

public interface ProductService {
	public void addProduct(Product p);
	public void updateProductCost(int cost,int pid);
	public void updateProduct(Product p);
	public void deleteProduct(int pid);
	public Product getProductById();
	public List<Product> getProducts();
	public List<Product> getProductsByBrand(String brand);

}
