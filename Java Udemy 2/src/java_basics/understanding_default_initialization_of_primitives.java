package java_basics;

/*
 * - we will see default initialization of primitives
 * - how local variables are not initialize by default
 * 
 */

public class understanding_default_initialization_of_primitives {

	// -variable outside main method
	// -variable here must be static in order to be used 
	// inside the main method
	
	static boolean myBoolean;
	static byte myByte;
	static short myShort;
	static int myInt;
	static long myLong;
	static float myFloat;
	static double myDouble;
	static char myChar;
	
	public static void main(String[] args) {
		// local variable is the variable that is declared in our method
		int localInt;
		
//		System.out.println("localInt= "+localInt); // will not compile
		
		// Printing the default values of the static variables
        System.out.println("Default boolean value: " + myBoolean);
        System.out.println("Default byte value: " + myByte);
        System.out.println("Default short value: " + myShort);
        System.out.println("Default int value: " + myInt);
        System.out.println("Default long value: " + myLong);
        System.out.println("Default float value: " + myFloat);
        System.out.println("Default double value: " + myDouble);
        System.out.println("Default char value: " + myChar);
   
	}

}
