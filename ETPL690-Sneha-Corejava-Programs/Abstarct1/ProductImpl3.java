package com.evergent.corejava.Abstarct1;

public class ProductImpl3 extends Product {
	public void show() {
		System.out.println("Local methods");
	}
	 public void newProduct() 
		 {
			 System.out.println("All products");
		 }
	 public static void main(String args[]) {
    	
			 ProductImpl product1=new ProductImpl();
			 product1.show();
			 product1.newProduct();
			 product1.allProducts();
		 }
	 }


