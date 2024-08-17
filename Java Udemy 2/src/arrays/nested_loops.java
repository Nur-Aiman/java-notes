package arrays;

import java.util.Arrays;

/*
 * we will learn : 
 * -what are nested loops?
 * -how to use nested loops with multidimensional arrays
 * -how does break and continue statements work inside the nested loops
 */

public class nested_loops {

	public static void main(String[] args) {
		for(int hours = 1; hours <= 6; hours++) {
			for(int minutes = 0; minutes < 60; minutes++) {
//				System.out.println(hours + ":" + minutes);
			}
		}
		
		int[][] myArray = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
//		System.out.println(myArray);		
//		System.out.println(Arrays.toString(myArray));
		
		OUTER:
			for(int[] rowArray : myArray) {
				INNER:
					for(int i = 0; i < rowArray.length; i++) {
						if(rowArray[i] % 2 == 0) {
//							break; // typing break without INNER will just break the first outer loop
							       // it will break the first loop when we go up, or the first outer loop of the break statement
//							break INNER;  // will print 1 and 7
//							break OUTER;  // will print 1 only
//							continue INNER; // will print 1, 3, 5, 7, 9
//							continue OUTER; // will print 1 and 7
						}
						
						
						System.out.print(rowArray[i] + " ");
					}
				System.out.println();	
			}
		
		int x = 10;
		while(x > 0) {
			do {
				// 1. execute until x = 5
				// 3. x = 3
				// 5. x = 1
				
				x -= 1;
			} while (x > 5);
			
			// 2. x-- -> x = 4
			// 4. x-- -> x = 2
			// 6. x-- -> x = 0
			x--;
			
			System.out.println("x=" + x);
		}
		
	}

}
