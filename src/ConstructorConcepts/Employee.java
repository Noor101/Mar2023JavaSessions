package ConstructorConcepts;

public class Employee {
	
	
	String name;
	String id;
	int age;
	double salary;
	boolean isPerm;
			
	
	public Employee() {
		System.out.println("Default constructor");
	}
	
	public Employee(int a) {
		System.out.println(a);
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Employee(String name, String id, int age, double salary, boolean isPerm) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}
	
	

}
