package JavaSessions;

public class StaticBlock {
	
	
	//Before main method i'm going to execute some piece of code so Static block is responsible
	
	public void firstMethod() {
		System.out.println("This is the first method");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is the main method");
		
		StaticBlock obj =  new StaticBlock();
		obj.firstMethod();
	}
	
	static {
		System.out.println("This is the static block which execute before Main method");
	}

}
