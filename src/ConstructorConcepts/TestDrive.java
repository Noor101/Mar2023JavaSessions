package ConstructorConcepts;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CarDesign car_alto = new CarDesign("Alto", "Red");
		System.out.println(car_alto.name + "" + car_alto.color+ car_alto.price);

		
		CarDesign car_bmw = new CarDesign("BMW", "Black", 80000, 'y' );
		
		System.out.println(car_bmw.name+ ""+ car_bmw.price + car_bmw.color + car_bmw.mileage + car_bmw.isAvailable);
		
		
		
		ArrayList<String> featurelist = new ArrayList<String>();
		featurelist.add("Parking Sensor");
		featurelist.add("Rear View");
		featurelist.add("Speed Engine");
		featurelist.add("Top Roof");
		
		CarDesign car_Audi = new CarDesign("Audi", "Blue", 900000, 'N', 15.56, false, featurelist);
		System.out.println(car_Audi.name + car_Audi.color+ car_Audi.price + car_Audi.isAvailable+car_Audi.mileage+car_Audi.isElectric+car_Audi.featureList);
		
		
		
	}

}
