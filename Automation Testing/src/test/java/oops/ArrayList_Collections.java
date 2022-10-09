package oops;

//ArrayList using Name and Roll number as example

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList_Collections {

	public static void main(String[] args) {
		Collection values=new ArrayList();
		
		 // Adding elements to the Array list
		
		values.add("Nidish");
		values.add("Rao");
		values.add(1);
		Iterator i= values.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
        
        // Removing elements from the Array list 
		
		values.remove(1);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		values.add(2);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		

	}

}
