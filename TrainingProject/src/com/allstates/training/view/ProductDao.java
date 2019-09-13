package com.allstates.training.view;

import java.util.List;

public interface ProductDao {
public int addProduct(Product p);
public int updateProductQuantity(int Productid,int qty);
public int updateProductCost(int Productid,int cost);
public int deleteProduct(int Productid);
public Product getProductById(int Productid);
public List<Product> getProducts();

}
