package oops;

//Method Overloading using Multiplication example

public class Overloading {

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		int value1 = obj.mul(5, 3);
		System.out.println("Multiplication of two int numbers is : "+ value1);
		int value2 = obj.mul(2, 3, 5);
		System.out.println("Multiplication of three int numbers is : "+ value2);
		float value3= obj.mul(1f, 3f);
		System.out.println("Multiplication of two float numbers is : "+ value3);

	}
	int mul(int a, int b) 	
	{
		return(a*b); //	Returns multiplication of 2 Integers
	}
	int mul(int a, int b, int c)
	{
		return(a*b*c);	//	Returns multiplication of 3 Integers
	}
	float mul(float a, float b)
	{
		return(a*b);	//	Returns multiplication of 2 floats
	}

}

	