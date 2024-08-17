package methods;

/*
 * we will learn about : 
 * -understanding returning data from methods
 */

public class returning_data_from_methods {

	public static void main(String[] args) {
		
		int number = 2;
		String word = "xyz";
		
		number(number);
//		number = number(number);
		
		word = word(word);  // we reassign 'word'
		System.out.println(number + word);
		
	}
	
	// copy is passed to the method. copy is our parameter
	public static int number(int number) {
		number++;
		return number;
	}
	
	public static String word(String word) {
		word += "a";  // xyza
		return word;
	}

}
