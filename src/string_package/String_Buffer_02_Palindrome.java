package string_package;

public class String_Buffer_02_Palindrome {

	public static void main(String[] args) {

		String s1 = "madam";  //or,	String s1 = "mad";
	
		StringBuffer sb = new StringBuffer(s1);

		String s2 = sb.reverse().toString(); // StringBuffer moved in String Method


		// String s1 reverse to s2 and out put is match then Palindrome if not match then not Palindrome

		if (s1.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
