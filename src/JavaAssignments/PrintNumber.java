package JavaAssignments;

public class PrintNumber {

	public static void main(String[] args) {

		//WAP to print only even numbers using for loop (1 to 10)
		//2 4 6 8 10
		
		for(int e = 2; e<=10; e++)
		{
			System.out.println(e);
			
			e = e+1;
	
		}

		
		System.out.println("------------");
		
		
		//WAP to print only odd number using for loop (1 to 10)
		// 1 3 5 7 9
		
		for(int odd = 1; odd<=10; odd++)
		{
			
			System.out.println(odd);
			odd = odd+1;
			
		}
		
		//Using modulus operator need to print only even numbers
		
		for(int h=2; h<=10; h++)
		{
			if(h % 2 == 0) {
			System.out.println(h);
		}
		}
		
		// Using modulus opearotr need to pring only odd numbers
		
		for(int k=1; k<=10;k++) {
			if(k%2==1) {
				System.out.println(k);
			}
		}
		
		System.out.println("------------");
		
		//Print number 10 to 1 using while loop
		
		int u = 100;
		while(u>=1) {
			System.out.println(u);
			u--;
		}

	}

}
