package class_objects_method;

public class Test_01 {

	public static void main(String[] args) {

		Teacher teacher1 = new Teacher (); // object declare

		teacher1.name = "Mokter Hossain";
		teacher1.gender = "Male";
		teacher1.phone = 617000000;

		System.out.println("Name : "+teacher1.name);
		System.out.println("Gender : "+teacher1.gender);
		System.out.println("Phone : "+teacher1.phone);



		System.out.println();
		Teacher teacher2 = new Teacher (); // object declare

		teacher2.name = "Lutfor Khan";
		teacher2.gender = "Male";
		teacher2.phone = 617000111;

		System.out.println("Name : "+teacher2.name);
		System.out.println("Gender : "+teacher2.gender);
		System.out.println("Phone : "+teacher2.phone);

	}

}
