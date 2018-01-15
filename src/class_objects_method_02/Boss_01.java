package class_objects_method_02;


public class Boss_01 {

	// # 1 test variable declare
	String name, gender;
	int phone;          

	public static void main(String[] args) {

		Boss_01 boss1 = new Boss_01 (); // object declare

		boss1.name = "Mokter Hossain";
		boss1.gender = "Male";
		boss1.phone = 617000000;

		System.out.println("Name : "+boss1.name);
		System.out.println("Gender : "+boss1.gender);
		System.out.println("Phone : "+boss1.phone);



		System.out.println();
		Boss_01 boss2 = new Boss_01 (); // object declare

		boss2.name = "Lutfor Khan";
		boss2.gender = "Male";
		boss2.phone = 617000111;

		System.out.println("Name : "+boss2.name);
		System.out.println("Gender : "+boss2.gender);
		System.out.println("Phone : "+boss2.phone);

	}

}
