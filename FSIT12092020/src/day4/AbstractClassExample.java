package day4;

/*
 * This program demonstrates the abstract class feature which behaves like parent class only
 *It can only be defined....It cannot be instantiated 
*/

abstract class A{
	void method1() {
		System.out.println("This is a non-abstract method of Class A");
	}
	abstract void method2();
	abstract void method3(int pass, String name);
}

class B extends A{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method 2 from Class B");
	}

	@Override
	void method3(int pass, String name) {
		// TODO Auto-generated method stub
		
	}
}
class C extends A{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method3(int pass, String name) {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method 3 from Class C...pass:"+pass+"=name:"+name);
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B(); // This is similar to B b = new B() statement since Abstract class can use child class instance to access the abstract class.... 
		a.method1();
		a.method2();
		a.method3(2, "Dhanya");
		System.out.println("*******************************");
		C c = new C();
		c.method1();
		c.method2();
		c.method3(3, "Binoy");
		System.out.println("*******************************");
	}

}

