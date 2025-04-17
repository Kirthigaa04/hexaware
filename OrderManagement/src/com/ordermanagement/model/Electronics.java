package com.ordermanagement.model;

public class Electronics extends Product {
	private String brand;
	private String warrantyPeriod;

	public Electronics(int productId, String productName, String description, double price, int quantityInStock,
			String type, String brand, String warrantyPeriod) {
		super(productId, productName, description, price, quantityInStock, type);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(String warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "Electronics [brand=" + brand + ", warrantyPeriod=" + warrantyPeriod + "]";
	}
	
	

	
}
