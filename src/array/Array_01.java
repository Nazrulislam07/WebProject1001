package array;

public class Array_01 {

	public static void main(String[] args) {

		int [] number ;
		number= new int [5]; //array declaration and creation

		// or, int [] number= new int [5]

		number [0]=10;
		number [1]=20;
		number [2]=30;  // Array initialize 
		number [3]=40;
		number [4]=50;
		
		
		int sum = number[0] + number [1]+ number [2] + number [3] + number [4];  // Array total declaration
		System.out.println("Total=" +sum);
		
		
				int L= number.length;
		System.out.println("Array size=" +L); // Array size printout 
		
		
	}	
} // End of class








