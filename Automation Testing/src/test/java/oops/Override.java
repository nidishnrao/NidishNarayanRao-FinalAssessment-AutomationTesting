package oops;

//Method Overriding using Father and Child class

class Father{
	void printing() {
		System.out.println(" This is a Father Class");
}
}

public class Override extends Father {
	void printing() {
		super.printing(); //calls superclass function from 'super' keyword
		System.out.println(" This is the Child Class");
	}
	public static void main(String[] args) {
		Override obj = new Override();
		obj.printing();

	}

}

