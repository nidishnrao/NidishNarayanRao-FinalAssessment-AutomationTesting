package oops;

//Abstracts using 2 methods as example

abstract class Abc{
	abstract void FirstMethod();
	void SecondMethod() {
		System.out.println("This are statements under SecondMethod");

	}
}
public class Abstracts extends Abc {

	public static void main(String[] args) {
		Abstracts obj = new Abstracts();
		obj.FirstMethod();

	}
	void FirstMethod() {
		System.out.println("This are statements under FirstMethod");
		SecondMethod();
	}

}


