package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.start(); // Override
		b.stop(); //inherited
		b.reFuel();//inherited
		b.autoParking();//child class
		BMW.SunRoof();
		System.out.println(b.engine);
		b.engine();
		
		
		System.out.println("-------------");
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.reFuel();
		Car.SunRoof();
		System.out.println(c1.engine);
		c1.engine();
		
		
		//down casting
		
		//BMW b1 = (BMW)new Car();
		
		

	}

}
