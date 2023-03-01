package MehtodAssignment;

public class MethodsTest {
	
	//1.Write a program to print the sum of two numbers entered by user by defining your own method
	
	public int sum(){
		
		int a = 10;
		int b = 20;
		int c= a+b;
		return c;
	}


	public static void main(String[] args) {

		MethodsTest obj = new MethodsTest();
		int sum1 = obj.sum();
		System.out.println(sum1);
		
		int multiply = obj.product(14, 27);
		System.out.println(multiply);
		
		double cir = obj.circle();
		System.out.println(cir);
		
		double circle = obj.area(5);
		System.out.println(circle);
		
		
	}
	
	
	//2. Define a method that returns the product of two numbers entered by user.
	
	public int product(int c, int d) {
		
		int mul = c * d;
		return mul;
	}

	
	//3.3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	
	public double circle() {
		
		int radius = 5;
		double pi = 3.14;
		
		double cirumference = 2*pi*radius;
		return cirumference;
	}
		
		public double area(double r){
			
		double ar= 3.14*r*r;
		return ar;
		}
		
		
	
}
