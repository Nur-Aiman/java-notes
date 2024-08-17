package arrays;

import java.util.Arrays;

/*
 * we will learn about : 
 * -what are variable arguments
 * -how to use variable arguments
 */

public class variable_arguments {

//	public static void main(String[] args) {
//		
//	}
	
		
		/*
		 * -variables arguments represented as array but you can 
		 * pass as many arguments as you want
		 * -for variables arguments, we can do the same operation that
		 * we do with array
		 * 
		 */
	
	public static void main(String... args) {
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
	    print(args);
	    print("Java");
	    print("this", "is", "my", "string", "array");
	    print(new String[] {"this", "is", "my", "string", "array"});
	    print("variable", "arguments", "are", "nice", "and", "useful", "feature");
	}
	
	private static void print(String... myArguments) {
		System.out.println(Arrays.toString(myArguments));
	}
	
	/*
	 * if we use this : 
	 * private static void print(String[] myArguments)
	 * 
	 * we need to do this : 
	 * print(new String[] {"this", "is", "my", "string", "array"});
	 * 
	 * because this won't compile : 
	 * print("this", "is", "my", "string", "array");
	 */

	

}
