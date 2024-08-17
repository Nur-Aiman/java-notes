import java.util.Arrays;

public class test1 {

	public static void main(String args[]) {
		int arr[] = { 2, 9, 4, 12, 54, 1, 68 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); 
		System.out.println(Arrays.binarySearch(arr, 9));

	}
}


