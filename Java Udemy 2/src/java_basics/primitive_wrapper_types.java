package java_basics;

/*
 * learn about : 
 * -what are wrapper types?
 * -what are boxing, unboxing and autoboxing
 */

public class primitive_wrapper_types {

	public static void main(String[] args) {
		int myInt = 10;
		
		// declare a wrapper class
		// it's easy to differentiate primitive and wrapper types
		// all wrapper start with capital letter
		Integer myInteger = new Integer(10);
		
		// -each wrapper class have some useful static methods
		// that we can use to convert string into primitive or into wrapper
		
		Integer myInteger2 = 20; // setting the value 20 as primitive
		Integer myInteger3 = Integer.valueOf(10);
		Integer myInteger4 = Integer.parseInt("3");
		
		// wrapper are object and object can hold null
		// integer can hold null but int can't hold null
		
		Integer myInteger5 = null;
//		int myInt2 = null; // compilation error
		
		System.out.println("myInt = " + myInt);
		System.out.println("myInteger (Wrapper initialized with constructor) = " + myInteger);
		System.out.println("myInteger2 (Autoboxed from primitive) = " + myInteger2);
		System.out.println("myInteger3 (Using valueOf) = " + myInteger3);
		System.out.println("myInteger4 (Converted from String) = " + myInteger4);
		System.out.println("myInteger5 (Wrapper holding null) = " + myInteger5);
	
		
	
	}

}
