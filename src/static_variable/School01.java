package static_variable;

public class School01 {

	// String schoolName = "MDHS";           


	static String schoolname = "MDHS" ;    // static variable is not related with object it's related with class                              
	                                        // You don't need create object for static variable



	public static void main(String[]agrs) {

		/*	School s = new School();
	System.out.println(" "+s.schoolName); */


System.out.println("Name : "+School01.schoolname);  // static variable related with class so class's name then .static member


	}

}
