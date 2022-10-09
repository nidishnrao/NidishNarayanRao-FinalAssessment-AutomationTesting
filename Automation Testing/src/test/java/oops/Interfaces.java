package oops;

//Interface using 2 methods as example

interface Interface1{
	void FirstMethod();
}
interface Interface2{
	void SecondMethod();
}
public class Interfaces implements Interface1,Interface2 {

	public static void main(String[] args) {
		Interfaces obj = new Interfaces();
		obj.FirstMethod();
		obj.SecondMethod();

	}
	public void FirstMethod() {
		System.out.println("This are statements under FirstMethod");
	}
	public void SecondMethod() {
		System.out.println("This are statements under SecondMethod");
	}

}


