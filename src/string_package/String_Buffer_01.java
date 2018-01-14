package string_package;

public class String_Buffer_01 {

	public static void main(String[] args) {
		
		 // String s1 = "Nazrul"; We could make a variable and use s1 instead of "Nazrul" in new stringBuffer 
		StringBuffer sb = new StringBuffer("Nazrul"); 
		System.out.println(sb);
		
		sb.append(" Islam "); // add Islam in Strigbuilder
		System.out.println(sb);
		
	/*	sb.append( 07); // add integer data type 
		System.out.println(sb);
		
		sb.reverse();  // used reverse method 
		System.out.println(sb);  
		
		sb.delete(0, 4); // delete o index thru 4 index
		System.out.println(sb);   */
		
		sb.setLength(5);  // used Setlength for print out until 5 index 
		System.out.println(sb);
		
		
	}
}
