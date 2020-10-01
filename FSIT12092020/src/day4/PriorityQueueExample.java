package day4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		que.add(10);
		que.add(200);
		que.add(180);
		que.add(350);
		que.add(154);
		
		System.out.println("Head: "+que.element()); //prints the top element in queue
		System.out.println("Head: "+que.peek());
		
		System.out.println("---------------------------------------------------------");
		Iterator<Integer> itr = que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		que.remove();// This removes the first element from queue
		que.poll();// This removes the first element from queue
		System.out.println("---------------------------------------------------------");
		System.out.println("After removing two elements from queue:");
		itr = que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}

}
