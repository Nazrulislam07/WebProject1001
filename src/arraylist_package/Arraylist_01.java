package arraylist_package;

import java.util.ArrayList;  // import 
import java.util.Iterator;   // import

public class Arraylist_01 {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();  // ArrayList create and declare


		// adding elements

		number.add(10);
		number.add(20);
		number.add(30);

		number.add(3, 40);

		// This is #1 way to print 

		System.out.println(number);


		// This is #2 way to print

		for (int i : number) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("size = "+number.size());


		// This is #3 way to print

		Iterator<Integer> itr = number.iterator();
		while (itr.hasNext()) {
			System.out.print(" " +itr.next());
		}

		// Removing elements

		number.remove(2);
		System.out.println();
		System.out.println("After removing elements : "+number);

		number.removeAll(number);
		System.out.println("After reomoing all :"+number);

		number.clear();
		System.out.println("After clear :"+number);



	}

}
