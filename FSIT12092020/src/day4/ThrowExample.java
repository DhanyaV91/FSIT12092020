package day4;

public class ThrowExample {
	
	static void ageCheck(int age) {
		if(age>18)
			System.out.println("You are eligible to vote!!!");
		else
			throw new NumberFormatException("You are not eligible to vote!!!");
	}

	public static void main(String[] args) {
		try {
			ageCheck(13);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("this is finally block!");
		}
		
		
		System.out.println("rest of code....");
	}

}
