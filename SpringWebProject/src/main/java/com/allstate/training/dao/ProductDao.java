package com.allstate.training.dao;

import java.util.List;

import com.allstate.training.entities.Product;

public interface ProductDao {
public void addProduct(Product p);
public void updateProductCost(int cost,int pid);
public void updateProduct(Product p);
public void deleteProduct(int pid);
public Product getProductById();
public List<Product> getProducts();
public List<Product> getProductsByBrand(String brand);
}
