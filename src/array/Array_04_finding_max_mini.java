package array;

import java.util.Scanner;

public class Array_04_finding_max_mini {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);  // used scanner type variable

		double [] number = new double [5];


		System.out.println("Please Enter 5 number : ");		

		for (int i = 0; i < 5; i++) {
			number [i] = input.nextDouble();
		}


		/*	double sum = 0;  // declare variable as sum name

		for (int i = 0; i < 5; i++) {
			sum = sum + number[i];
		}
		System.out.println("The sum is : "+sum);

		double avg = sum/5;
		System.out.println("The average is : "+avg);   */



		double max = number [0];
		double mini = number [0];


		for (int i = 1; i < 5; i++) {
			if (max < number[i]) {
				max = number [i];
			}

			if (mini > number [i]) { 
				mini= number[i];
			}	
		}
		System.out.println("Maximum = "+max);		
		System.out.println("Minimum = "+mini);

	}

}
