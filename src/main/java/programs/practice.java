package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class practice {

	
	public static void main(String[] args) {
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("Apple");
	a.add("Grapes");
	a.add("orange");
	a.add("Gauva");
	a.add("pineApple");
	a.add("Mangos");
	
	ListIterator<String> iterator = a.listIterator(3);
	 while (iterator.hasPrevious()) {
		 
		          String i = iterator.previous();
		          System.out.println(i);
	 }
	}
	
	

}






