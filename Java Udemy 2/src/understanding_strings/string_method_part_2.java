package understanding_strings;

/*
 * we will learn about : 
 * -equals(), equalsIgnoreCase()
 * -startsWith(), endsWith()
 * -contains()
 * -replace()
 * -trim()
 */

public class string_method_part_2 {

	public static void main(String[] args) {
		
		String str = "java";
		String str2 = "Java";
		String str3 = "ja";
		
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		
		System.out.println();
		
		// startsWith / endsWith
		System.out.println(str.startsWith("j"));
		System.out.println(str.startsWith(str3));
		System.out.println(str.startsWith("J"));
		System.out.println(str.startsWith("J".toLowerCase()));
		System.out.println(str.endsWith("va"));
		
		System.out.println();
		
		// contains
		System.out.println(str.contains(str3));
		System.out.println(str.contains("av"));
		System.out.println("Java".contains("j"));
		
		System.out.println();
		
		// replace
		String myString = "Java" + " " + "is" + " " + "cool";
		
		System.out.println(myString.replace('a', 'A'));
		System.out.println(myString.replace(" ", "_"));
		System.out.println(myString.replace("is", "_"));
		System.out.println(myString);
		
		System.out.println();
		
		// trim
		System.out.println("Java".trim());
		System.out.println(" Java is cool ");
		System.out.println(" Java is cool ".trim());
		
		


		
		
		

	}

}
