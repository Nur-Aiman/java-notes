package methods;

import java.util.ArrayList;
import java.util.List;

/*
 * we will learn about : 
 * -keyword final
 * -how to use final variables
 */

public class final_variables {
	
	private static final int SIZE = 10;
//	private static int SIZE = 10;
	
	private static final List<String> VALUES = new ArrayList<>();


	public static void main(String[] args) {
		
		/*
		 * variable that will never change are known
		 * as constant and they use final modifier
		 */
		
		int[] myArray = new int[SIZE];
		
//		SIZE = 11;  // compilation error. cannot assign value to final variable
		
//		SIZE++; // compilation error
		
		int doubleSize = 2 * SIZE;
		
		for(int i = 0; i < SIZE; i++) {
			System.out.println(myArray[i]);
		}
		
		VALUES.add("changed");
//		VALUES = new ArrayList<>(); // final variable does not allow this

		final int myNumber = 10;
//		myNumber = 11; // compilation error
	}

}
