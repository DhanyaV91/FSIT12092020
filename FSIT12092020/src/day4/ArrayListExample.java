package day4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		list.add("Jackfruit");
		
		//traverse through list
		Iterator res = list.iterator();
		while(res.hasNext()) {
			System.out.println(res.next());
		}
		
		System.out.println("--------------------------------------------------");
		
		list.remove(2);
		res = list.iterator(); //res object is specified again since we have removed an element from the list!!!
		while(res.hasNext()) {
			System.out.println(res.next());
		}		
	}

}
