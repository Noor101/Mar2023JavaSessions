package ConstructorConcepts;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1 =  new Employee();
		e1.name = "Henry Mark";
		e1.age = 25;
		e1.isPerm = true;
		e1.salary = 98744;
		
		Employee e2  = new Employee(25);
		
		Employee e3 =  new Employee("Ferooz", 28);
		System.out.println(e3.name + " " + e3.age);
		
		Employee e4 = new Employee("Walter", "Walter123", 32, 78936.50, true);
		System.out.println(e4.name+ " "+ e4.age +" "+ e4.salary);
		

	}
	
	

}
