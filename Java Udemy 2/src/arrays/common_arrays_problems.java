package arrays;

/*
 * we will learn about : 
 * -index problems
 * -looping problems
 * -initialization problems
 * -length problems
 */

public class common_arrays_problems {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		for(int i = 1; i < numbers.length; i++) {
			System.out.println(i + " - " + numbers[i]);
		}
		
		for(int i = 1; i <= numbers.length - 1; i++) {
			System.out.println(i + " - " + numbers[i]);
		}
		
//		int[20] nums; // cannot initialize size here
		int[] nums = new int[20];  // size only at initialization
		
//		int size = numbers.length();  // does not compile. length is not a method
		
		int size = numbers.length;
		
//		numbers.length = 10; // does not compile because length of array cannot be modified. only can set array size on initialization
		

	}

}
