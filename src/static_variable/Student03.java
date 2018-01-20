package static_variable;

public class Student03 {

	/*   int count = 0; // non static variable */
	static int count =  0 ; // static variable


	Student03(){

		count++;
	}

	void totalStudent() {


		System.out.println("Total Student =  "+count);
	}



	public static void main(String[]agrs) {

		Student03 s1 = new Student03();
		s1.totalStudent();

		Student03 s2 = new Student03();
		s2.totalStudent();

		Student03 s3 = new Student03();
		s3.totalStudent();



	}
}