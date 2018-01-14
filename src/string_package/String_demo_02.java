package string_package;

public class String_demo_02 {

	public static void main(String[] args) {

		String firstName= "Nazrul";
		String lastName= " Islam";


		//	String fullName = firstName + lastName; or,   // Use + operator 

		String fullName = firstName.concat(lastName); // Use .concat metheod

		System.out.println("Full Name = " +fullName);

		

		String upperName = fullName.toUpperCase(); // FullName print by uppercase use by .uppercase
		System.out.println("UpperName = "+upperName);
		


		String lowerName = fullName.toLowerCase(); // FullName print by lowercase use by .lowercase
		System.out.println("LowerName = "+lowerName);
		
		

		boolean b = firstName.startsWith("N"); // Find out the first Name start with N is it true or false
		System.out.println("First = " +b);

		
		
		boolean c = lastName.endsWith("f"); // Find out the last Name end with f is it true or false
		System.out.println("Last = " +c);

	}

}
