package arraylist_package;

import java.util.ArrayList;

public class Arraylist_03 {

	public static void main(String[] args) {

		
		ArrayList<Integer> number1 = new ArrayList <>();
		ArrayList<Integer> number2 = new ArrayList <>();
		ArrayList<Integer> number3 = new ArrayList <>();

		number1.add(10);
		number1.add(20);
		number1.add(30);
		number1.add(40);
		
		System.out.println("number 1="+number1);
		
		
		number2.add(100);
		number2.add(110);
		number2.add(120);
		number2.add(130);
		
		System.out.println("number 2="+number2);
		
		
		number3.addAll(number1); // add number1 all value
		System.out.println("number 3 ="+number3);
		
		boolean b = number1.equals(number2); // Find out the equals value
		System.out.println("Number1 == Number2 : "+b);
		
		
		boolean c = number1.equals(number3); // Find out the equals value
		System.out.println("Number1 == Number3 : "+c);
		
	}

}
