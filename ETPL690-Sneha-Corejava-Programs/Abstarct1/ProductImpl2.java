package com.evergent.corejava.Abstarct1;

public class ProductImpl2 extends Product2 {
	ProductImpl2(){
		 System.out.println("ProductImpl3 : constructor");
	 }
	public void show() {
		System.out.println("Local show methods");
	}
	 
	public void newProduct() {
		 System.out.println("MY New Product");
	}

	public static void main(String[] args) {
		ProductImpl3 product1=new ProductImpl3();
		product1.show();
		product1.newProduct();
		product1.allProducts();
		
	} 
}



