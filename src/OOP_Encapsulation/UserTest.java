package OOP_Encapsulation;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users user = new Users();
		
		// 1. Directly accessing them
		user.name = "Tom";
		System.out.println(user.name);
		
		// 2. Using construcor
		
		Users U1 = new Users("Lisa", 25, 101);
		
		System.out.println(U1.name + ""+ U1.age+ "" +U1.id);
		
		//3. Using getter and setter
		
		Users u2 = new Users();
		
		u2.name = "Steve";
		u2.age = 35;
		u2.id = 2001;
		
		
		System.out.println(u2.getAge()+ " " + u2.getName() + " " + u2.id);
		

	}

}
