package java_basics;

/*
 * -declaring variables
 * -initializing variables
 * -valid and invalid identifiers
 */

public class declaring_and_initializing_variables {

	public static void main(String[] args) {
		// variables can be declared and initialize in the same line or multiple line
		
		// declaring and initializing in two lines
		int myNumber; // declaration
//		System.out.println("myNumber "+ myNumber); // compilation error
		myNumber = 10; // initialization
		System.out.println("myNumber "+ myNumber);

		
		// one line
		double myDouble = 7.50;
		System.out.println("myDouble "+ myDouble);
		
		float myFloat1, myFloat2, myFloat3;
		float myFloat4; float myFloat5;
		float myFloat6 = 5f, myFloat7 = 10f, myFloat8;
		boolean b1, b2;
		
//		double d1, double d2; // does not compile
		
		int i1;
		int i2;
//		int i3; i4; // does not compile
		
		// can't named variable using java reserve keyword
		
//		int int = 10; // does not compile
		
		char cHaR;
		
		float okFloat;
		double $ok2Double;
		double _alsoDouble;
		
		// illegal examples
//		double 3Dpoint; // will not compile. variable name can't start with number
//		float double;// will not compile
		
	}

}
