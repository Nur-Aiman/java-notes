package understanding_strings;

/*
 * we will learn about : 
 * -string equality
 * -string pool
 */

public class string_pool_and_string_equality {

	public static void main(String[] args) {
		
		String name = "John";
		String anotherName = "John";
		String john = "Jo" + "hn"; // concatenate at compile time // this is same as "John" // concatenating 2 string literal
		String newName = new String("John");
		
		/*
		 * when we use double quote to create strings,
		 * Java first look for string with the same value
		 * in the string pool. If the string is found, it just 
		 * return the reference. Else, it creates a new string
		 * in the pool and then returns the reference
		 */
		
		System.out.println("name == anotherName -> " + (name == anotherName));
		System.out.println("name == john -> " + (name == john));
		System.out.println("name == newName -> " + (name == newName));
		
		/*
		 * -number 1 and 2 true is because both variables are referencing
		 * to the same string in the string pool
		 * -String name = "John" create the "John" string in the string
		 * pool, and the "anotherName" and "john" variable just refer
		 * to the same string in the pool
		 */
		
		/*
		 * when we create a string newName, we are creating another
		 * reference of string object in the string pool
		 */
		
		/*
		 * the == check 2 objects for equality and return true
		 * if they are equal
		 */
		
		/*
		 * -the equals() method check whether those 2 variables containing
		 * the same information no matter if they are referencing differently
		 * -same information but not the same reference
		 */
		
		System.out.println();
		
		System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
		System.out.println("name.equals(john) -> " + name.equals(john));
		System.out.println("name.equals(newName) -> " + name.equals(newName));
		
		System.out.println();
		
		// identity hashCode also known as memory location
		
		System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
		System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
		System.out.println("john - identityHashCode -> " + System.identityHashCode(john));
		System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));
		
		System.out.println();
		
		String str1 = "abc";
		String str2 = "ab";
		String str3 = str2 + "c"; // concatenate at runtime // concatenate variable and string literal // create a new string in memory
		String str4 = "ab" + "c"; // concatenate at compile time // concatenate string literal
		
		System.out.println();
		
		System.out.println("str1 - identityHashCode -> " + System.identityHashCode(str1));
		System.out.println("str2 - identityHashCode -> " + System.identityHashCode(str2));
		System.out.println("str3 - identityHashCode -> " + System.identityHashCode(str3));
		System.out.println("str4 - identityHashCode -> " + System.identityHashCode(str4));
		
		System.out.println();
		
		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // false
		System.out.println(str1 == str4); // true 

	}

}
