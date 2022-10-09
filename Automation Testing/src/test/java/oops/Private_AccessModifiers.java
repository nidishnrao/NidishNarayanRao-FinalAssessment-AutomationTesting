 package oops;
 
 //Private Access Modifiers

 class newprivateclass{  
	 private void privatemethod(){// private method to class newprivateclass
	 	System.out.println("This is the private access modifier!");}  
	 }
 
public class Private_AccessModifiers extends newprivateclass {

	public static void main(String[] args) {
		Private_AccessModifiers obj= new Private_AccessModifiers();
		obj.printing();
		//Uncommenting the below line will throw error as it is out of scope /NOT VISIBLE
		//obj.privatemethod(); //cannot Access Private method of other class  

	}
	
	private void printing() { // private method to class Private_AccessModifiers
		System.out.println("This is method for class Private_AccessModifiers!");
	}

}

