package JavaSessions;

public class MethosInJava {

	public static void main(String[] args) {
	
		MethosInJava obj = new MethosInJava();
		obj.test();
		
		int val = obj.getMarks();
		System.out.println(val);
		
		String  nameslist = obj.getName();
		System.out.println(nameslist);
		
		
		int value  = obj.sum(10, 50);
		System.out.println(value);
		
	}
	
	// 1. no input and no return
	public void test() {
		System.out.println("test method");
	
	}
	//2. no input some return
	public int getMarks() {
		
		System.out.println("get marks");
		int total = 100;
		int bonus = 500;
		int totalMarks = total + bonus;
		
		return totalMarks;
	}
	
	public String getName() {
		
		System.out.println("get names");
		String n = "Noor";
		return n;
		
	}
	//Some input and some return
	
	public int sum(int a, int b) {
		System.out.println("get sum");
		int z = a + b;
		return z;
	}

}
