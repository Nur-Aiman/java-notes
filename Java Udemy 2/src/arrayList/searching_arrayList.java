package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * we will learn : 
 * -how to search elements in ArrayList
 */

public class searching_arrayList {

	public static void main(String[] args) {
		
		List<String> numsList = new ArrayList<>();
		numsList.add("500");
		numsList.add("10");
		numsList.add("9");
		numsList.add("50");
		numsList.add("40");
		
		System.out.println(numsList);
		
		int index = Collections.binarySearch(numsList, "10");
		// we will get -1. our arrayList needs to be sorted first
		// when arrayList is not sorted, result of binary search is undefined
		
		System.out.println(index);
		
		Collections.sort(numsList);
		System.out.println(numsList);
		index = Collections.binarySearch(numsList, "10");
		System.out.println(index);
		
		List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
		System.out.println(numbers);
		
		index = Collections.binarySearch(numbers, 7);
		System.out.println(index);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		index = Collections.binarySearch(numbers, 7);
		System.out.println(index);
	}

}
