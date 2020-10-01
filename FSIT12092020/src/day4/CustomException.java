package day4;

class InvalidAge extends Exception{
	InvalidAge(String a){
		super(a);
	}
}

public class CustomException {
	
	static void ageCheck(int age) throws InvalidAge{
		if(age>18)
			System.out.println("You are eligible to vote!!!");
		else
			throw new InvalidAge("You are not eligible to vote!!!");
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
