package day4;

final class Sample{
	
	final int val=1000;
	void display() {
		System.out.println("This is final class display method!");
	}
	
	//Overloading display()
	void display(int x) {
		System.out.println("This is final class display method with x="+x);
	}
	
	void display(int x, int y) {
		System.out.println("This is final class method with 2 parameters:x="+x+", y:"+y);
	}	
}

abstract class Sample1{
	abstract void display1();
	final void display3() {
		System.out.println("This is display3 method in Sample1 class!");
	}
}

public class FinalOverloadingOverriding extends Sample1 {
	
	@Override
	void display1() {
		System.out.println("This is method1!");		
	}
	

	public static void main(String[] args) {
		Sample s = new Sample();
		s.display();
		System.out.println("--------------------------------------");
		s.display(2);
		System.out.println("--------------------------------------");
		s.display(10, 20);
		System.out.println("--------------------------------------");
		
		
		Sample1 s1 = new FinalOverloadingOverriding();
		s1.display1();
		s1.display3();
	}
}
