package oops;

//Default Access Modifiers

class newdefaultclass{  
	void defaultmethod(){ 
	System.out.println("This is the default access modifier!");}  
} 

public class Default_AccessModifiers extends newdefaultclass {

	public static void main(String[] args) {
		Default_AccessModifiers obj= new Default_AccessModifiers();
		obj.printing1();
		obj.defaultmethod();

	}
	
	void printing1() {
		System.out.println("This is method for class Default_AccessModifiers!");
	}

}
