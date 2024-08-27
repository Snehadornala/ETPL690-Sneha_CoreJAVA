package com.evergent.corejava.Abstarct1;

public class ProductImpl extends Product{
	public void show() {
		System.out.println("Local method");
	}
	
	public void newProduct(){
		System.out.println("My New Product");
	}
	

	public static void main(String[] args) {
		ProductImpl product1=new ProductImpl();
		product1.show();
		product1.newProduct();
		product1.allProducts();
		
		
		
		

	}

}
