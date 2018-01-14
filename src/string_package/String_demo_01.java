package string_package;

public class String_demo_01 {

	public static void main(String[] args) {


		String s1 = "Nazrul Islam";
		String s2 = new String ("Nazrul Islam");


		System.out.println("s1 =" +s1);	
		System.out.println("s2 =" +s2);	


		char [] s3 = {'N','a','z','r','u','l'};
		System.out.println(s3);

		
		
		int l = s1.length();
		System.out.println("Length of s1= " +l); // Find out of length of s1
		
		

		if (s1.equals(s2)) {  // Compare to value s1 and s2 and we can also use .contains method

			System.out.println("Equals");

		}	else {
			System.out.println("Not equals");

		}
	}
}


