package arraylist_package;

import java.util.ArrayList;

public class Arraylist_02 {

	public static void main(String[] args) {


		ArrayList<Integer> number = new ArrayList<Integer>();  // ArrayList create and declare


		// adding elements

		number.add(10);
		number.add(20);
		number.add(30);

		number.add(3, 40);


		System.out.println(number);
		System.out.println("size = "+number.size());


		// number.clear();
		boolean check = number.isEmpty();
		System.out.println("ArrayList empty : "+check);

		boolean b = number.contains(20); // Find out 20 is in the arraylist
		System.out.println("20 is in the list : "+b ); 

		int i =number.indexOf(30);  // Find out of 30 index
		System.out.println("The index of 30 is : "+i);

		number.set(2, 100);  // set the replace value in index
		System.out.println("After setting :"+number);

		int x =number.get(1); // get value in index 2
		System.out.println("Index 1 ="+x);
	}

}
