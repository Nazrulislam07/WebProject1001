package class_objects_method_02;


public class Boss_03 {

	//   test variable declare
	String name, gender;
	int phone;          


	//   test method declare 
	void displayInformation() {

		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Phone : "+phone);
		System.out.println();
	}



	//  test Parameterize method declare 
	void setInformation(String n, String m, int phn) {
		name = n;
		gender = m;
		phone = phn;


	}


	public static void main(String[] args) {

		Boss_03 boss1 = new Boss_03 (); // object declare

		boss1.setInformation("Mokter Hossain","Male",617000000);
		boss1.displayInformation();



		Boss_03 boss2 = new Boss_03 (); // object declare

		boss2.setInformation("Lutfor Khan","Male",617000111);
		boss2.displayInformation();


	}

}
