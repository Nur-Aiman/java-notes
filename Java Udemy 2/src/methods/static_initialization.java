package methods;

import java.util.ArrayList;
import java.util.List;

/*
 * we will learn : 
 * -what is static initialization
 * -how to use static initialization
 */

public class static_initialization {
	
	private static final int SIZE; // will get compilation error if not initialize
	
	private static int one;
	private static final int two;  // will get compilation error if not initialize
	private static final int three = 3;
	
	private static final List<String> NAMES = new ArrayList<>();
//	private static final int four;  // this one will not compile cause we never initialize it
	
	static {
		// for final variable, if it is not assign
		// initially, for example like SIZE, it can 
		// only be initialize in static initializer
		// block
		System.out.println("first static init");
		int rows = 5;
		int columns = 4;
		SIZE = rows * columns;
	}
	
	static {
		System.out.println("second static init");
		one = 1;
		two = 2;
		one = three;
//		three = 3;  // compilation error. cannot assign because it is final
//		two = 2;  // compilation error
		one = 2;
		one = three;
	}
	
	
	// for final variable, we cannot re-assign but we
	// can call method
	static {
		System.out.println("third static init");
		NAMES.add("Jimmy");
		NAMES.add("Timmy");
	}

	public static void main(String[] args) {
		// static initializer is called first before
		// executing the code below
		System.out.println(NAMES);
		
		

	}

}
