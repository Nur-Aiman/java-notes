package arrays;

import java.util.Arrays;

/*
 * we will learn :
 * -how to search arrays
 * -we will see some binary search rules
 */

public class searching_arrays {

	public static void main(String[] args) {
		
		/*
		 * binary search split array into 2 equal pieces, and determine,
		 * in which piece the target number is. it repeat until 1 element left
		 */
		
		int[] numbers = {1, 3, 5, 6, 7};
		
		System.out.println(Arrays.binarySearch(numbers, 2)); // -2
		System.out.println(Arrays.binarySearch(numbers, 5)); // 2
		System.out.println(Arrays.binarySearch(numbers, 7)); // 4
		System.out.println(Arrays.binarySearch(numbers, 1)); // 0
		System.out.println(Arrays.binarySearch(numbers, 3)); // 1
		System.out.println(Arrays.binarySearch(numbers, 6)); // 3
		System.out.println(Arrays.binarySearch(numbers, 4)); // -3. the location where the number needs to be inserted
		
		int[] notSortedNumbers = {5, 4, 10, 8, 6};
		
		System.out.println();
		
		System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 8));
		
		System.out.println();
		
		Arrays.sort(notSortedNumbers);
		System.out.println(Arrays.toString(notSortedNumbers));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 8));

	}

}
