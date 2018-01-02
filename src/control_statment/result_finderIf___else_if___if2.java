package control_statment;

public class result_finderIf___else_if___if2 {

	public static void main(String[] args) {


		// If..else if..else statement
		//Total marks 1000
		//First Division= 600 or more
		//Second Division= 450 or <600
		//Third Division= 330 or <450\n

		String Result;

		Result = ">=330";

		if (Result==">=600")
		{
			System.out.println("Result: The student has passed with a 'First Division'.");
		}

		else if (Result==">=450")
		{
			System.out.println("Result: The student has passed with a 'Second Division'.");
		}

		else
		{
			System.out.println("Result: The student has either passed with a 'Third Division' or failed.");
		}


	}

}