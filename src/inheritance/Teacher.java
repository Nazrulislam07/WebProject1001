package inheritance;


// Teacher class inheritance by person class
public class Teacher extends Person {
	//name,age,displayInformation1()   those are here invisible 
	String qualification;
	float id;
	int phone;

	void displayInformation2() {

		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Qualification : "+qualification);
		System.out.println("Id : "+id);
		System.out.println("Phone : "+phone);
	}

	public static void main(String [] args) {
		Teacher t1 = new Teacher ();
		t1.name = "Mokter Hossain";
		t1.age = 40;
		t1.qualification ="Masters in computer science";
		t1.id = 101;
		t1.phone = 617000000;

		t1.displayInformation2();



		Teacher t2 = new Teacher ();
		t2.name = "Lutfor Khan";
		t2.age = 38;
		t2.qualification ="Masters in computer science";
		t2.id = 102;
		t2.phone = 617000111;

		t2.displayInformation2();
	}
}