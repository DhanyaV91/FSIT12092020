package day4;

/*
 * This program demonstrates Thread feature using multiplication table
*/

class MultiplicationTable{
	synchronized void PrintTable(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i+" X "+n+" = "+i*n);
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	MultiplicationTable t;
	MyThread1(MultiplicationTable t){
		this.t = t;
	}
	public void run() {
		t.PrintTable(5);
	}
}

class MyThread2 implements Runnable{
	
	MultiplicationTable t;
	
	MyThread2(MultiplicationTable t){
		this.t = t;
	}

	@Override
	public void run() {
		t.PrintTable(10);		
	}
	
}

public class ThreadExample {

	public static void main(String[] args) {
		MultiplicationTable mt = new MultiplicationTable();
		MyThread1 t1 = new MyThread1(mt);
		MyThread2 t2 = new MyThread2(mt);
		
		
		t1.start();
		t2.run();
	}

}
