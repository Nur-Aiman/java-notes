package java_basics;

/*
 * -what is null and how it works
 * -default object initialization
 * -dealing with NullPointerExceptions
 */

public class understanding_null {
	
	// object is class in java
	// declare variable object and declare it as new object
	static Object myObject = new Object(); // initialization
	static Object myOtherObject; // without initialization // same as static Object myOtherObject = null;
	static int myInt;
	static String myString;
	

	public static void main(String[] args) {
		// in java everything is object
		// imagine variables as containers
		// variable is reference to an object
		// null value indicates that you have an unset or empty reference or reference to nothing
		// calling methods on null object will cause null pointer exceptions
		
		// define local variable
		Object myLocalObject = new Object();
		Object anotherLocalObject; // without initialization
		
		String name = "Java";
		String anotherName = null; // without initialization
		// if we don't initialize local variable, we won't be able to use those variables
		String nama;
		
		System.out.println("myObject= " + myObject);
		System.out.println("myOtherObject= " + myOtherObject);
		
		System.out.println("myLocalObject= " + myLocalObject);
		// for the below code, we can't use it (compilation error) cause it 
		// is not initialize. This rule is same as primitive
//		System.out.println("anotherLocalObject= " + anotherLocalObject);
		
		
		System.out.println("name= " + name);
		// for the below code, we can use it because we initialize it to null
		
		System.out.println("anotherName= " + anotherName);
		
		
		// comment this code to see NullPointerException
		myString = "Java";
		
		System.out.println("myString= " + myString);
		
		
//		we will get null pointer exception with the following code
//		for global variable, we can use it even when we don't initialize it
//		but we will get null pointer exception
		myString.toLowerCase(); // this line will trigger null pointer exception
		// for the above method, later we will learn why myString does not print
		// lowercase 'java' but print 'Java' instead
		
		
		// for local variable, if we don't initialize, we can't called any method 
		// with that variable. We will get compilation error
//		nama.toLowerCase();
		System.out.println("myString= " + myString);
		
		/*
		 * -local variable cannot be used if we don't initialize
		 * -global variable can be use even if we don't initialize
		 */

	}

}
