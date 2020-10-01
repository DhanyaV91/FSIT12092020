package day4;

/*
 * This program demonstrates the Arithmetic Exception Handling...
 * The Execption is ArrayOutOfBoundException
*/

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int data = 100;
		int a[] = new int[3];
		try {//Monitors run time errors...if any error occurs then catch block is executed
			System.out.println(data/0);
			
		}
		catch(ArithmeticException ae){//associated catch block is executed if none specified then default catchg block is executed
			System.out.println("Exception catched");
		}
		try {
			a[4] = 1000;
		}
		catch(ArrayIndexOutOfBoundsException ae){//associated catch block is executed if none specified then default catchg block is executed
			System.out.println("ArrayIndexOutOfBoundsException catched");
		}
		finally {//runs after try catch blocks even if error occurs or not occurs
			System.out.println("This is a finally block!!!");
		}
		System.out.println("Rest code is here...");
	}

}
