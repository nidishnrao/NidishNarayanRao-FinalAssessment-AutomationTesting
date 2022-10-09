package oops;

//LinkedList using Name and Roll number as example

import java.util.LinkedList;

public class LinkedList_Collections {

	public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        
        // Adding elements to the linked list
        
        ll.add("Nidish");
        ll.add("Rao");
        ll.addLast("2");
        ll.addFirst("1");

         
        System.out.println(ll);
        
        // Removing elements from the linked list
 
        ll.remove("2");
        ll.removeFirst();
 
        System.out.println(ll);
    }

}


