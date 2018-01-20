package inheritance;

public class Father extends GrandFather{
	// getName{},setName{},setAge{},getAge{}   

	private String Designation;
	private float Homenumber;
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public float getHomenumber() {
		return Homenumber;
	}
	public void setHomenumber(float homenumber) {
		Homenumber = homenumber;
	}

}


class Son extends Father{
	private String car;
	private int phone;


	public String getCar() {
		return car;
	}


	public void setCar(String car) {
		this.car = car;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public static void main(String[]args) {

		Son s1 = new Son();

		s1.setName("Ishar");
		s1.setAge(75);
		s1.setDesignation(null);
		s1.setHomenumber(125/5);
		s1.setPhone(339000000);
		s1.setCar("Honda");

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getDesignation());
		System.out.println(s1.getHomenumber());
		System.out.println(s1.getPhone());
		System.out.println(s1.getCar());
		System.out.println();


		Son s2 = new Son();

		s2.setName("Satter");
		s2.setAge(55);
		s2.setDesignation(null);
		s2.setHomenumber(125/5);
		s2.setPhone(339000178);
		s2.setCar("Toyata");

		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getDesignation());
		System.out.println(s2.getHomenumber());
		System.out.println(s2.getPhone());
		System.out.println(s2.getCar());
		System.out.println();


		Son s3 = new Son();

		s3.setName("Nazrul");
		s3.setAge(30);
		s3.setDesignation(null);
		s3.setHomenumber(125/5);
		s3.setPhone(339111000);
		s3.setCar("Nissan");

		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getDesignation());
		System.out.println(s3.getHomenumber());
		System.out.println(s3.getPhone());
		System.out.println(s3.getCar());
	}
}   