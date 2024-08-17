package arrays;

/*
 * we will learn about : 
 * -multidimensional arrays
 * -symmetric and asymmetric multidimensional arrays
 * -declaring and initializing multidimensional arrays
 */

public class multidimentional_arrays {

	public static void main(String[] args) {
		// 1d arrays
		int[] myArray = {0, 1};
		
		// 2d arrays
		int[][] array = new int[2][4]; // 2 row 4 column
		int anotherArray[][] = new int[2][4];
		
		int[] myIntArray[] = new int[2][4];
		
		String[][] my2dArray = new String[][] {
			{"One", "Two"}, // 1st row 2 elements
			{"Three", "Four", "Five"}, // 2nd row 3 elements
			{"Six", "Seven", "Eight", "Nine"}, // 3rd row 4 elements
			null // 4th row 0 element
		};
		
		int[][] numberTable = new int[2][3];
		numberTable[0][0] = 1;
		numberTable[0][1] = 2;
		numberTable[0][2] = 3;
//		numberTable[0][3] = 4;   // out of bound
		
		// 3d arrays
		// pages(planes), rows, columns
		int[][][] threeArray = new int[3][3][3];
		threeArray[0][0][0] = 1;
		
		int onMoreThreeArray[][][] = new int[3][3][3];
		
		int[] anotherThreeArray[][];
		
		int[][][] threeDArray = {
				{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
				{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
				{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
		};

	}

}
