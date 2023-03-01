package ConstructorConcepts;

import java.util.ArrayList;

public class CarDesign {
	
	String name;
	String color;
	int price;
	char isAvailable;
	double mileage;
	boolean isElectric;
	ArrayList<String> featureList;
	
	
	public CarDesign(String name, String color, int price, char isAvailable, double mileage, boolean isElectric,
			ArrayList<String> featureList) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAvailable = isAvailable;
		this.mileage = mileage;
		this.isElectric = isElectric;
		this.featureList = featureList;
	}


	public CarDesign(String name, String color, int price, char isAvailable) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAvailable = isAvailable;
	}


	public CarDesign(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	
	
	
	
	

	
	//creating constructor
	
	

}
