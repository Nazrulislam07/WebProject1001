package static_variable;

public class Student02 {

	String name;
	int id;
	static String universityName = "NU"; // static variable is not related with object it's related with class
                                          // You don't need create object for static variable
	
	Student02(String n, int i){
		name = n;
		id = i;	
	}

	void displayInformation() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("University Name: "+universityName);
		System.out.println();
	}

	public static void main(String[]agrs) {

		Student02 s1 = new Student02 ("Nazrul",101);
		Student02 s2 = new Student02 ("Nabila",102);

		s1.displayInformation();
		s2.displayInformation();

	}

}
