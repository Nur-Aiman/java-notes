package arrays;

import java.util.Arrays;

/*
 * we will learn : 
 * -how to sort arrays
 */

public class sorting_arrays {

	public static void main(String[] args) {
		int[] numbers = {5, 10, 2};
		
		Arrays.sort(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		
		// strings are sorted in alphabetical order
		String[] strings = {"50", "9", "500"};
		Arrays.sort(strings);
		
		System.out.println(Arrays.toString(strings));
		
		

	}

}
