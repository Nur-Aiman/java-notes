package java_basics;

/*
 * learn about : 
 * - floating point literals
 * - default interpretation of decimal numbers
 * - using hexadecimal notation with floating point numbers
 */

public class decimal_numeric_primitives {

	public static void main(String[] args) {
		
		// decimal numeric primitives are float and double
		// when you see decimal numbers without any letters,
		// means the decimal number is double
		
		
		// to declare float, must use letter 'f' or 'F'
		float myNumber = 25.4F;
		
		//double before = 10_.25; // does not compile
		//double after = 10._25 // does not compile
		//double first = _10.25 // does not compile
		//double last = 10.25_; //does not compile
		
		double myDouble = 2.54;
		double myDouble2 = 2.54f; // f does not mean anything
		double anotherDouble = 2.45d; // d represents double
		// by default all numbers are double so we don't need to specify 'd'
		double scientific = 5.000125E03; // this can compile
		double myDouble3 = 5000.125;
		// scientific = myDouble3

	}

}
