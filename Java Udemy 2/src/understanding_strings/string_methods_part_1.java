package understanding_strings;

/*
 * we will learn about : 
 * -length()
 * -charAt()
 * -indexOf()
 * -subString()
 * -toUpperCase(), toLowerCase()
 * 
 */

public class string_methods_part_1 {

	public static void main(String[] args) {
		
		String str = "Java is fun";
		
		// length
		System.out.println("length= " + str.length());
		
		// charAt
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(10));
//		System.out.println(str.charAt(12));
		
		// indexOf
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a',2));
		System.out.println(str.indexOf("fun"));
		System.out.println(str.indexOf("fun", 10));  // match not found
		
		// subString()
		System.out.println(str.substring(8));
		System.out.println(str.substring(0, 5)); 
		System.out.println(str.substring(4, 4));  // empty string
		
//		System.out.println(str.substring(4, 2)); // out of range
//		System.out.println(str.substring(8, 14));  // out of range

		System.out.println("AbCd".toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		String dog = "Lucky";
//		dog.toUpperCase();
		dog = dog.toUpperCase();
		System.out.println(dog);
	}

}
