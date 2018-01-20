package inheritance;

public class Student {

	String name, gender;
	int roll;
	float mark;



	void display() {
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Mark :"+mark);
		System.out.println("Roll :"+roll);

	}


	public static class Boy extends Student{
		String subject;
		int phone;

		@Override
		void display() {
			System.out.println("Name :"+name);
			System.out.println("Gender :"+gender);
			System.out.println("Subjet :"+subject);
			System.out.println("Mark :"+mark);
			System.out.println("Phone :"+phone);
			System.out.println("Roll :"+roll);
			System.out.println();
		}	


		public static void main(String[]args) {


			Student s1 = new Student ();

			s1.name = "Farhad Hasan";
			s1.gender = "male";
			s1.mark = 75.5f;
			s1.roll = 12;

			s1.display();
			System.out.println();	


			Boy b = new Boy ();

			b.name = "Akash Ahmed";
			b.gender = "male";
			b.subject = "computer science";
			b.mark = 80f;
			b.roll = 17; 
			b.phone = 1975864146;

			b.display();


		}

	}
}