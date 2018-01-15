package class_objects_method_02;



public class Boss_02 {

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

	public static void main(String[] args) {

		Boss_02 boss1 = new Boss_02 (); // object declare

		boss1.name = "Mokter Hossain";
		boss1.gender = "Male";
		boss1.phone = 617000000;
		boss1.displayInformation();


		Boss_02 boss2 = new Boss_02 (); // object declare

		boss2.name = "Lutfor Khan";
		boss2.gender = "Male";
		boss2.phone = 617000111;
		boss2.displayInformation();


	}

}
