package JavaSessions;

public class Employee {

	
	//classs vars
	
	String name;
	int age;
	double salary;
	boolean isActive;
	
	
	public void finalize() {
		System.out.println("Come inside the employee class and execute this method");
	}
	
	
	public static void main(String[] args) {
		
		//create obj of the class employee using new keyword
		
		Employee e1 = new Employee();
		
		e1.name = "Noor";
		e1.age = 26;
		e1.salary = 7800;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		Employee e2 =new Employee();
		e2= null;
		
		
		Employee e3 = new Employee();
		e3.name = "Raj";
		e3.age = 27;
		e3.salary = 8950;
		
		System.out.println(e3.name + " " + e3.age+ " "+ e3.salary);

	}

}
