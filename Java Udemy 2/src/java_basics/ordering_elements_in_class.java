//import java.util.*; // package must be in first line

package java_basics;

/*
 * learn about : 
 * -valid and invalid element order
 * -dealing with common compile time errors
 * 
 */

import java.util.*;

//package java_basics; // compilation error. must declare package first before import


//int myInt = 10; // variable cannot be outside of class

//// cannot have method outside of class
//public void myMethod() {
//	
//}

class myOtherClass {
	
}

// we can only have 1 public class in 1 java file
//public class AnotherClass{} // compilation error
class AnotherClass{} // this will compile

public class ordering_elements_in_class {

	public static void main(String[] args) {
		int anotherInt = 20;
		
		// does not compile
		// method cannot be inside another method
//		void myMethod() {
//			
//		}
	}
	
	// PIC (package, import, class) // order to remember

}
