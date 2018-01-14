package string_package;


public class String_demo_03 {

	public static void main(String[] args) {

		String country = "Bangladesh is my Homeland";
		System.out.println(country);
		

		char ch = country.charAt(0);  // Find out o index
		System.out.println("ch = " +ch);
		

		int value = country.codePointAt(0); // Find out the ASCII value of o index
		System.out.println("value = "+value);

		
		int pos = country.indexOf('n');  // Find out the index number of character but if there so many same character it's gonna find first one  
		System.out.println("first position of n = "+pos);

		

		pos = country.lastIndexOf('n'); // Find out the last index of character 
		System.out.println("last position of n = "+pos);



	}

}
