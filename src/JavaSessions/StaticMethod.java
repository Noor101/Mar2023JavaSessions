package JavaSessions;

public class StaticMethod {

	static int age;
	String name;

	public static void main(String[] args) {

	
		StaticMethod obj = new StaticMethod();
		obj.name = "Noor";
		System.out.println(obj.name);
		
		age = 25;
		StaticMethod.getInfo();
		
	}
	
	public static void getInfo() {
		System.out.println("Get info");
		
		System.out.println("Static method is not overrided");
		
		
		
	}

}
