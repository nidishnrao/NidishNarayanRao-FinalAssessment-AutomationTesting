package oops;

//Exception Handling using try and catch block

public class ExceptionalHandling {

	public static void main(String[] args) {
		try {
			int x=1;
			int y=0;
			int z=x/y; //Runtime Arithmetic exception
			System.out.println(z);
		}
		
		catch(ArithmeticException e) {
			System.out.println("ERROR Cannot Divide By Zero");
		}

	}

}

