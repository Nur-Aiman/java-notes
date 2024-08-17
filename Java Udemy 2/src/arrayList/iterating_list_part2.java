package arrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * we will learn : 
 * -how to create performance test for iterating list
 */

public class iterating_list_part2 {

	public static void main(String[] args) {
		
		// how to determine what should we use when iterating through list
		// for, foreach, iterator, listiterator
		
		List<String> list = Arrays.asList(createArray());
		
		// for loop
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
		}
		
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println("for loop totalTime= " + totalTime + " ms");
		
		// for each
		startTime = System.currentTimeMillis();
		
		
//		String str;
//		for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); str = iterator.next()) {	
//		}
		
		
		for(String temp : list) {}
		
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("for each loop totalTime= " + totalTime + " ms");


		// iterator
		startTime = System.currentTimeMillis();
		
		for(Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String temp = iterator.next();
			
		}
		
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("iterator loop totalTime= " + totalTime + " ms");

		
		// listIterator
		startTime = System.currentTimeMillis();
		
		for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
			String temp = listIterator.next();
		}
		totalTime = System.currentTimeMillis() - startTime;
		System.out.println("listIterator loop totalTime= " + totalTime + " ms");

		
	}
	
	private static String[] createArray() {
		String[] stringArray = new String[1_000_000];
		// change 1 million to 10 million or any other value to see different result
		
		for(int i = 0; i < stringArray.length; i++) {
			stringArray[i] = "Array " + i;
			
		}
		return stringArray;
	}

}
