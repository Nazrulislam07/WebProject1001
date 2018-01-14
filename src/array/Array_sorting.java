package array;

import java.util.Arrays;

public class Array_sorting {

	public static void main(String[] args) {

		int [] number = {1, 5, 9, 25, 45, 60, 78, 95};

		Arrays.sort(number);


		System.out.print("Ascending : ");
		for (int i = 0; i < 8; i++) {
			System.out.print(" "+number[i]);
		}


		System.out.println();
		System.out.print("Descending : ");
		for (int i = 7; i >=0; i--) {
			System.out.print(" "+number[i]);
		}


		// for string 
		System.out.println();
		String [] names = {"Nazrul", "Arif", "Habib", "Uzzal", "Aminul"};
		Arrays.sort(names);


		for (int i = 0; i < 5; ++i) {
			System.out.print(names[i]+" ");
		}



		System.out.println();
		for (int i = 4; i >=0; i--) {
			System.out.print(names[i]+" ");
		}
	} 

}
