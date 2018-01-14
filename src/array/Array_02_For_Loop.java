package array;


public class Array_02_For_Loop {

	public static void main(String[] args) {

		String [] name = new String [4];

		name [0]= "Robin";
		name [1]= "Tuhin";
		name [2]= "Rana";
		name [3]= "Babu";

		for (int i= 0; i<4; i++ ) {
			System.out.println(name[i]);

		}  // or 






		/*String [] name = { "Robin","Tuhin","Rana","Babu"};
	for (String x : name) {

		System.out.println(x);
	}*/






		// 	For loop Int deta type use

		/* int [] num = {10,20,30,40,50,60,70,80,90,100};


	for (int x : num) {

	System.out.println(x);	
	} */





		// Find out for total
		/* int [] num = {10,20,30,40,50,60,70,80,90,100};

		int sum = 0;
		for (int x : num) {
         sum = sum + x;	
		}

		System.out.println(sum); */


	}	// End of main()
} // End of class


