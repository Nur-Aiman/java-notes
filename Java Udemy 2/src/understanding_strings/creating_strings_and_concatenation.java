package understanding_strings;

/*
 * we will learn : 
 * -how to create strings
 * -how to concatenate strings
 */

public class creating_strings_and_concatenation {

	public static void main(String[] args) {
		
		/*
		 * these 2 string have the same content but
		 * are different references
		 */
		String text = "hello";
		String anotherText = new String("hello");
		
		/*
		 * -if we use '+' for integer, it is an addition
		 * -if we use '+' for string, it is a concatenation
		   Number + string is also concatenation
		 */
		
		System.out.println(2+3); // 5
		System.out.println("a" + "b"); // ab
		System.out.println(1 + 2 + "d"); //3d (execute from left to right)
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); // 64
		
		int number = 10;
		int anotherNumber = 20;
		System.out.println("result= " + number + anotherNumber);
		System.out.println("result= " + (number + anotherNumber));
		
		String str = "";
		for(int i = 0; i < 10; i++) {
			str += i + " ";	
		}
		
		System.out.println(str);
		
		String hello = "hello";
		String world = "world";
		String helloWorld = hello + world;
//		hello + world; // this statement won't compile
				
		System.out.println(hello);
		

	}

}
