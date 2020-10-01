package day4;

class Shape{
	void Shape() {
		System.out.println("This is Shape class constructor!");
	}
	void rectangle() {
		System.out.println("This is rectangle function!");
	}
	void square() {
		System.out.println("This is Square function!");
	}
	void circle() {
		System.out.println("This is Circle function!");
	}
}

interface Color{
	abstract void paint(int color);

	default void print()
	{
	System.out.println("I am a non-abstract method in interface..this feature is available gfrom java 1.8");	
	}
}

public class InterfaceExample extends Shape implements Color{

	@Override
	public void paint(int color) {
	  if(color==1)
		  System.out.println("Red Color");
	  else if(color==2)
		  System.out.println("Green Color");
	  else
		  System.out.println("Please select red or green");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	InterfaceExample e = new InterfaceExample();
	e.circle();
	e.paint(1);
	
	System.out.println("*******************");
	
	e.rectangle();
	e.paint(2);
	System.out.println("*******************");
	
	e.square();
	e.paint(3);
	
	System.out.println("*******************");
	
	
	}

}
