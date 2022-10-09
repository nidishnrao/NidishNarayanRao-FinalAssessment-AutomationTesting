package oops;

//Vector using 1-5 numeric value as example

import java.util.Vector;

//Vector using Name and Roll number as example

public class Vector_Collections {

	public static void main(String[] args) {
		
        Vector<Integer> v = new Vector<Integer>();
  
        // Adding elements to the Vector
        
        for (int i = 1; i <= 5; i++)
            v.add(i);
  

        System.out.println(v);
  
     // Removing elements from the Vector
        
        v.remove(4);
  
     
        System.out.println(v);
  
   
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }

}


