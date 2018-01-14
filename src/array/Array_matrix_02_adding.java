package array;

import java.util.Scanner;

public class Array_matrix_02_adding {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int [][] A = new int [2][3];		
		int [][] B = new int [2][3];


		// getting input for A matrix
		System.out.println("Enter elements for A matrix :");	
		for (int r = 0; r < 2; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("A [%d][%d]= ",r,c);
				A [r][c] = input.nextInt();
			}
		}

		// getting input for B matrix	
		System.out.println("Enter elements for B matrix :");	
		for (int r = 0; r < 2; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("B [%d][%d]= ",r,c);
				B [r][c] = input.nextInt();
			}
		}


		// Printing  A matrix
		System.out.print("A = ");
		for (int r = 0; r < 2; r++){			
			for (int c = 0; c < 3; c++) {
				System.out.print("\t " +A[r][c]);
			}
			System.out.println();

		}
		System.out.println("\n");
		// Printing B matrix
		System.out.print("B = ");
		for (int r = 0; r < 2; r++){
			for (int c = 0; c < 3; c++) {
				System.out.print("\t " +B[r][c]);
			}
			System.out.println();
		}

		System.out.println();
		// adding A and B Matrix
		System.out.print("A+B = ");
		for (int r = 0; r < 2; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("\t "+(A[r][c] + B[r][c]));

			}
			System.out.println();
		}

	}	

}
