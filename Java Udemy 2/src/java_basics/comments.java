package java_basics;

/*
 * - we will learn about comments
 * - we will learn about single line and multiline comments
 * - we will learn about javadocs comments
 */

public class comments {

	public static void main(String[] args) {
		
		// this is single line comment
		//
		// empty comment
		//
		// commenting code
		
		
		/*
		 * 
		 * Multiline comments
		 * 
		 */
		
		// javadoc comment (usually at the beginning of the code)
		// javadoc comment usually on method or class
		// 
		
		/**
		 * @author aiman on 11/9/2023
		 * 
		 */
		
		sum(0, 0);
	}
	
	/**
	 * Calculate sum of two integers
	 * @param a operand
	 * @param b operand
	 * @return sum
	 */
	public static int sum(int a, int b) {
		return a*b;
	}

}
