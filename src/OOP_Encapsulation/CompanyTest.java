package OOP_Encapsulation;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company C1 = new Company();
		C1.name = "Deloitte";
		C1.count = 256;
		
		Employee e1 = new Employee();
		e1.setSalary(1000);
		System.out.println(e1.getSalary());
		
		
		e1.setSalary(5000);
		System.out.println(e1.getSalary());
		
		e1.setInsurance("Insurance credit upto 1 lack");
		System.out.println(e1.getInsurance());
		
		
		
		

	}

}
