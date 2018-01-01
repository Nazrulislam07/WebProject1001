package control_statment;

public class Switch {

	public static void main(String[] args) {


		/*use of Switch as a conditional statement*/
		/* Switch keyword has variable instead of input*/

		int Day=5;
		switch(Day)
		{
		case 1:

			System.out.println("Monday is the first at day of the week.");break;

		case 2:

			System.out.println("Tuesday our students has swiming.");break;

		case 3:

			System.out.println("Wednesday we are go to big gym.");break;

		case 4:

			System.out.println("Thursday we play in the play ground.");break;

		case 5:

			System.out.println("Every Friday we go to field trip.");break;

		case 6:

			System.out.println("Saturday I spend free time with my family.");break;

		case 7:

			System.out.println("I'm taking online class on Sunday.");


		default:

			System.out.println("you are no where in 7 days!");

		}

	}
}