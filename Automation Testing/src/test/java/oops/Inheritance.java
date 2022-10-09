package oops;

//Inheritance using Grandfather-father-child example

class Grandparent{
	void GrandFatherMethod()
	{
		System.out.println("This is Grandfather class!");
	}
}
class Parent extends Grandparent{
	void FatherMethod()
	{
		System.out.println("This is Father class!");
		GrandFatherMethod();
	}
}

public class Inheritance extends Parent {

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.ChildMethod();
	}
	
	void ChildMethod()
	{
		System.out.println("This is Child class!");
		FatherMethod();
	}
	
}