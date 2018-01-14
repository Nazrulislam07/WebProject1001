package string_package;

public class String_demo_04 {

	public static void main(String[] args) {

		String s1 = " This is my country ";
		System.out.println(s1);


		String s2 = s1.replace('i', 'o'); // used replace method o instead of i
		System.out.println(s2);


		String [] s3 = s1.split(" "); // used split method and when its find " " imean space then its divid there
		for (String x : s3) {
			System.out.println(x);
		}

	}

}
