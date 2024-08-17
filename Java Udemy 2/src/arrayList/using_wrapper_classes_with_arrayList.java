package arrayList;

import java.util.List;
import java.util.ArrayList;

/*
 * we will learn : 
 * -how to use wrapper with ArrayList
 * -converting string to wrapper and primitive
 * 
 */

public class using_wrapper_classes_with_arrayList {

	public static void main(String[] args) {
		
//		List<double> doubleList = new ArrayList<>();  // compilation error because primitive are not classes. primitive can't be used with ArrayList
		
		// use primitive wrapper classes
		List<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.5);  // autoboxing. convert double primitive into double class
		doubleList.add(new Double(55.10));  // unnecessary boxing
		System.out.println(doubleList);
		doubleList.remove(55.10); // autoboxing
		double first = doubleList.get(0); // unboxing to primitive
		
		System.out.println(doubleList);
		System.out.println(first);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(null);
		
		System.out.println(numbers);
		
//		int number = numbers.get(0);  // null pointer exception because int can't hold null
		
		// primitive can't hold 'null'. they can only hold '0'
		// wrapper can hold null
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1); // index 0
		nums.add(2); // index 1
		
//		nums.remove(1);  // remove element at index '1'
		nums.remove(new Integer(1)); // remove object of value 1
		
		System.out.println(nums);
		
	}

}
