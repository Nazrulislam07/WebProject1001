package array;

import java.util.Scanner;

public class Array_04_finding_sum_average {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);  // used scanner type variable

		double [] number = new double [5];


		System.out.println("Please Enter 5 number : ");		

		/*	number [0] = input.nextDouble();
    	number [1] = input.nextDouble();
		number [2] = input.nextDouble();  //used input.nextDouble type variable
		number [3] = input.nextDouble();
		number [4] = input.nextDouble();  */ 

		// or
		for (int i = 0; i < 5; i++) {
			number [i] = input.nextDouble();
		}


		double sum = 0; // declare variable as sum name

		//sum = number[0] + number[1] + number[2] + number[3] + number[4];

		//or
		for (int i = 0; i < 5; i++) {
			sum = sum + number[i];
		}
		System.out.println("The sum is : "+sum);


		// System.out.println("The average is : "+sum/5);
		// or

		double avg = sum/5;
		System.out.println("The average is : "+avg);

	}


}


