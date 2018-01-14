package array;

public class Array_output_2 {

	public static void main(String[] args) {

		int [][] number = new int [4][];
		int k = 0; // used a variable as k and initially set value 0

		number [0] = new int [1];
		number [1] = new int [2];
		number [2] = new int [3];  // Declare the column
		number [3] = new int [4];

		// assigning the value to the 2d array
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < r+1; c++) {  // r = 0 so adding +1 every time and increasing in column
				number [r][c] = k;
				k++;
			}
		}

		// Printing the elements

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < r+1; c++) {
				System.out.print(" "+number[r][c]);
			}
			System.out.println(); // make a new line before start work in column
		}
	}
}		
