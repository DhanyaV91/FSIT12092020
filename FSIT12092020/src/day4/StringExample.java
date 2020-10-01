package day4;

public class StringExample {

	public static void main(String[] args) {
		String s1 = " Apple ";
		String s2 = " I like";
		String s3 = new String();
		System.out.println(s2.concat(s1));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.concat(s1.trim()).trim());
		System.out.println(s1.substring(0, 3));
	}

}
