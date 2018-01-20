package static_method;

public class StaticMethod {


	void dispalay1() {
		System.out.println("This is no static method");
	}


	static void display2() {
		System.out.println("This is static method");
	}


	public static void main(String[] args) {

		StaticMethod sm1 = new StaticMethod();
		sm1.dispalay1();

		StaticMethod.display2(); // don't need make object for static method or member, you can access using by class's name		
	}
}


// static method can't use non static member
// "this" and "super" keyword can,t be used here