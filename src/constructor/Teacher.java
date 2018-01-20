package constructor;

public class Teacher {

	// variable declare
	String name, gender, subject;
	int  phone;
	float id;


	// default constructor
	Teacher(){
	System.out.println("No information");
	}

	Teacher(String n, String g, float i  ){
		name = n;
		gender = g;
		id   = i;
	}



	// Parameterize constructor create
	Teacher(String n, String g, String s, int phn, float i ) {
		name = n;
		gender = g;
		subject = s;
		phone = phn;
		id    = i;
	}


	void displayInformation () {
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Subject : "+subject);
		System.out.println("Phone : "+phone);
		System.out.println("ID : "+id);
		System.out.println();
	}
	public static void main(String[] args) {

		Teacher teacher1 = new Teacher ("Moketer Hossain", "Male", "Computer Science",617000000,101); //object create and value initialize
		teacher1.displayInformation();


		Teacher teacher2 = new Teacher ("Lutfor Khan", "Male", "Computer Science",617000111,102);  //object create and value initialize
		teacher2.displayInformation();


		Teacher teacher3 = new Teacher ();
		teacher3.displayInformation();



		Teacher teacher4 = new Teacher ("Lisa", "Female",103);
		teacher4.displayInformation();


	}

}
// I used overloading constructor