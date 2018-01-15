
package class_objects_method;

public class Teacher {

	// # 1 test variable declare
	String name, gender;
	int phone;          


	// # 3 test Parameterize method declare 
	void setInformation(String n, String m, int phn) {
		name = n;
		gender = m;
		phone = phn;
	}

	
	
	// # 2 test method declare 
	void displayInformation() {

		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Phone : "+phone);
		System.out.println();

	}
}
