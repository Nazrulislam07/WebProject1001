package array;

import java.util.Scanner;

public class Array_matrix_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int [][] A = new int [2][3];		
		int [][] B = new int [2][3];

		System.out.println("Please enter the numbers:");	


		// getting input for A matrix		
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				A [row][col] = input.nextInt();
			}
		}

		// Printing  A matrix
		System.out.println("A = ");
		for (int row = 0; row < 2; row++){
			for (int col = 0; col < 3; col++) {
				System.out.print(" " +A[row][col]);
			}
			System.out.println();
		}



		// getting input for B matrix		
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				B [row][col] = input.nextInt();
			}
		}

		// Printing  B matrix
		System.out.println("B = ");
		for (int row = 0; row < 2; row++){
			for (int col = 0; col < 3; col++) {
				System.out.print(" " +B[row][col]);
			}
			System.out.println();
		}

	}	

}
