package JavaAssignments;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "I Love JAVA";
		
		//To Reverse the string
		
		int len = s.length();
		
		String r ="";
		
		for(int i=len-1; i>=0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println(r);
		
		
	 System.out.println(Reverse("Hello"));
		
		
	}
	
	//functions to reverse
	public static String Reverse(String val) {
		
		if(val==null) {
			return null;
		}
		
		 int l = val.length();
		 
		 if(l==1) {
			 return val;
		 }
		 
		 String rev = "";
		 
		 for(int i=l-1;i>=0;i--) {
			 rev = rev+val.charAt(i);
		 }
		 
		 return rev;
		
	}

}
