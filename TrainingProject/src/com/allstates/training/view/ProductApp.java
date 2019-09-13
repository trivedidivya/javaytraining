package com.allstates.training.view;

import java.util.List;
import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductDao productDao=new ProductDaoImpl();
		do {
			System.out.println("welcome 1. add product 2.update qty 4. delete by id 5. get product  by id 6. getall");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("enter the product details (id name cost qty)");
			        Product p=new Product();
			        p.setProductid(sc.nextInt());
			        p.setPname(sc.next());
			        p.setCost(sc.nextInt());
			        p.setQty(sc.nextInt());
			        int i=productDao.addProduct(p);
			        if(i>0)
			        	System.out.println("product is added");
			        	else 
			        		System.out.println("product not addded");
			        break;
			case 2: System.out.println("enter product id you want to update");  
			System.out.println("enter qty  to update");
			int i1=productDao.updateProductQuantity(sc.nextInt(),sc.nextInt());
			break;
			case 4: System.out.println("enter product id you want to delete");  
		
			int i2=productDao.deleteProduct(sc.nextInt());
			 if(i2>0)
		        	System.out.println("product is deleted");
		        	else 
		        		System.out.println("product not deleted");
			break;
			case 5: System.out.println("enter id for the product to be fetched");
				Product d =productDao.getProductById(sc.nextInt());
			System.out.println(d);
			break;
			case 6: List<Product> pd =productDao.getProducts();
			System.out.println(pd);
			break;
			default: 
				break;
			        
			}
		}while(true);
	}
}
