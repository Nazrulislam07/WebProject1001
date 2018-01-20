package static_Block;

public class StaticBlock {

	static int id;
	static String name;


	// static block
	static {
		id = 101;
		name ="Nazrul Islam";  // initialize the variable in static block		
	}

	static void display () {
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);		

	}

	public static void main(String[] args) {

		StaticBlock.display();


	}
}