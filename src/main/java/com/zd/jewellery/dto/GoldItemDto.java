package com.zd.jewellery.dto;

public class GoldItemDto {
	
	private String name;
	
	private double price;
	
	private String discription;
	
	private double weight;

	public GoldItemDto(String name, double price, String discription, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.discription = discription;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
