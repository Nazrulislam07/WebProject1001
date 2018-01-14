package arraylist_package;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_04 {

	public static void main(String[] args) {


		ArrayList<Integer> number = new ArrayList<>();	

		number.add(10);
		number.add(-5);
		number.add(85);
		number.add(48);
		number.add(0);
		number.add(8);

		System.out.println("Before sorting : "+number);

		Collections.sort(number);
		System.out.println("After sorting in ascending  : "+number);


		Collections.sort(number,Collections.reverseOrder());
		System.out.println("After sorting in descending  : "+number);
	}

}
