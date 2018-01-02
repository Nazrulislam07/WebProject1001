package control_statment;

public class Switch_Result_finder {

	public static void main(String[] args) {

		/*System.out.println("Total marks 1000");
		System.out.println("First Division= 600 or more");
		System.out.println("Second Division= 450 or <600");
		System.out.println("Third Division= 330 or <450\n");*/


		int result=300;

		switch (result)
		{
		case 1000:
			System.out.println("Full marks = 1000");
			break;

		case 600:
			System.out.println("Result: The student has passed with a 'First Division'.");
			break;

		case 450:
			System.out.println("Result: The student has passed with a 'Second Division'.");
			break;

		case 330:
			System.out.println("Result: The student has passed with a 'Third Division'.");
			break;

		case 329:
			System.out.println("Result: The student has 'Failed'.");
			break;

		default:
			System.out.println("Student's record was not found.");
		}

	}

}