package day4;

import java.io.IOException;

class NF{
	
	void ageCheck(int age) throws Exception{
		if(age > 18)
			System.out.println("Eligible to vote!!!");
		else
			throw new NumberFormatException("You are not eligible to vote!!!");
	}
	
	void n() throws IOException {
		System.out.println("Device error found!");
	}
}

public class ThrowsExample {

	public static void main(String[] args){
		NF n = new NF();
		try {
			n.ageCheck(13);
			n.n();
		}catch(Exception e) {
			System.out.println(e);
		}finally {}
	}

}
