// CSD420 - Advanced Programming with Java
// Name: Maria Q. Michaels
// Date: 08/28/2022
// Assignment: Module 4 Assignment
// Purpose: Write a test program that stores 50,000/500,000 integers in LinkedList and test the time to traverse the list using an iterator vs. using the get(index) method.
// References: https://stackabuse.com/how-to-get-current-date-and-time-in-java/, https://www.geeksforgeeks.org/list-get-method-in-java-with-examples/, https://www.geeksforgeeks.org/listiterator-in-java/

/*
Observation: Time to traverse the number of values using an iterator is much faster than using the get(index) approach.
Based on the results, the difference between using the methods was significant. The iterator method is faster for any collections
that have no random access included (such as LinkedList in this case). This is due to the fact that when using get(index) with a 
LinkedList, there is no constant time operation hence traversing the LinkedList with this method can take a very long time.
With get (index), the method will have to go through all nodes, meaning that it will be very slow. The iterator method goes from node
to node but remembers last state.
*/ 


import java.util.*;
public class MichaelsModuleFour {
	public static void main(String[] args) {
		// Create a list to store integers
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 500000; i++) {
			arrayList.add(i);
		}
		LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
		long iterTimeS = System.currentTimeMillis();
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		long iterTimeE = System.currentTimeMillis();
		System.out.println("Traverse time with an iterator method: " + (iterTimeE - iterTimeS));

		long getTimeS = System.currentTimeMillis();
		for (int i = 0; i < 500000; i++) {
			linkedList.get(i);
		}
		long getTimeE = System.currentTimeMillis();
		System.out.println("Traverse time with a get(index) method: " + (getTimeE - getTimeS));
	}
}