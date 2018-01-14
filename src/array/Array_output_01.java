package array;

public class Array_output_01 {

	public static void main(String[] args) {

		int [][] number = new int [4][5];
		int k = 0; // used a variable as k and initially set value 0

		// assigning the value to the 2d array
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 5; c++) {
				number [r][c] = k;
				k++;
			}
		}

		// Printing the elements

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(" "+number[r][c]);
			}
			System.out.println(); // make a new line before start work in column
		}
	}
}		
