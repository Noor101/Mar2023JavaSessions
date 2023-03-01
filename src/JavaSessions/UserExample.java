package JavaSessions;

public class UserExample {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		UserExample u1 = new UserExample();
		u1.name = "Naveen";
		u1.age = 25;
		u1.city = "chennai";
		
		UserExample u2 = new UserExample();
		u2.name = "Ritish";
		u2.age = 26;
		u2.city = "Mumbai";
		
		
		UserExample u3 = new UserExample();
		u3.name = "Rajesh";
		u3.age = 28;
		u3.city = "Bangalore";
		
		System.out.println(u1.name+ " "+u1.age+ " "+ u1.city);
		System.out.println(u2.name+ " "+u2.age+ " "+ u2.city);
		System.out.println(u3.name+ " "+u3.age+ " "+ u3.city);
		
		
		System.out.println("------------");
		u1=u2;
		
		//In that case U reference will denote U2 then
		
		System.out.println(u1.name+ " "+u1.age+ " "+ u1.city); // Ritish
		System.out.println(u2.name+ " "+u2.age+ " "+ u2.city); // Ritish
		System.out.println(u3.name+ " "+u3.age+ " "+ u3.city); //Rajesh
		
		
		System.out.println("------------");
		
		
		u2=u3;
		
		System.out.println(u1.name+ " "+u1.age+ " "+ u1.city); // Ritish
		System.out.println(u2.name+ " "+u2.age+ " "+ u2.city); // Rajesh
		System.out.println(u3.name+ " "+u3.age+ " "+ u3.city); // Rajesh
		
		
		System.out.println("------------");
		
		u3=u1;
		
		System.out.println(u1.name+ " "+u1.age+ " "+ u1.city); // Ritish
		System.out.println(u2.name+ " "+u2.age+ " "+ u2.city); // Rajesh
		System.out.println(u3.name+ " "+u3.age+ " "+ u3.city); // Ritish
		
		
		
		
		

	}

}
