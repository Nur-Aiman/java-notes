package arrays;

import java.util.Arrays;

/*
 * we will learn about : 
 * -what are arrays
 * -how to declare arrays
 */

public class understanding_arrays {

	public static void main(String[] args) {
		
		int[] one = new int[3]; // array with 3 element. all element will be '0' because int by default is '0'
		int[] two = new int[] {10, 11, 12}; // array with 3 elements with real value
		
//		double[] a = new double[2.55];  // we can't define size as decimal number
		
		double[] b = new double[4*5/2]; // creates array with 10 elements
		
		int x = 4;
		int y = 4;
		
		double[] c = new double[x*y];  // creates empty array with 16 elements
		
		
		int[] three = {10, 11, 12}; // anonymous array
		int[] four = {}; // empty array with anonymous
		
		int[] a1;
		int[] a2;
		int a3[];
		int a4[];
		
		
		// declare 2 arrays in the same line
		int[] ids, types;  // creates 2 array
		int ids2[], types2;   // creates array and int, bad practice
		
		String[] animals = {"Parrot", "Dog", "Cat"};
		String[] myAnimals = animals;
		String[] otherAnimals = {"Parrot", "Dog", "Cat"};
		
		System.out.println(animals.equals(myAnimals));  // true
		System.out.println(animals == myAnimals);  // true
		System.out.println(Arrays.equals(animals, myAnimals));  // true
		
		System.out.println(animals.equals(otherAnimals));  // false
		System.out.println(animals == otherAnimals);  // false
		System.out.println(Arrays.equals(animals, otherAnimals));  // true
		
		System.out.println(animals);
		System.out.println(animals.toString());
		
		System.out.println(Arrays.toString(animals));
		
		

	}

}
