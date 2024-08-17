package understanding_strings;

/*
 * we will learn : 
 * -what is string builder
 * -how to use string builder
 * -mutability and chaining methods
 */

public class using_string_builder_class {

	public static void main(String[] args) {
		
		/*
		 * -a small program can really quickly create a lot of string object that take memory
		 * -since string is immutable, whenever you call method on string or append multiple
		 * strings that creates a new string object
		 * 
		 */
		
		String myString = "";
		
		for(char c = 'a'; c <= 'z'; c++) {
			myString += c;  //every iteration this will create new String object
		}
		
		System.out.println(myString);
		
		
		/*
		 * -to avoid creating new object all the time which is inefficient, it is better to use
		 * string builder class
		 * -string builder class is use to build string
		 * -string builder is not immutable. string is immutable
		 * -imagine string builder as container. you can put string
		 * -after you have finish building your string, you call toString method to convert
		 * content to string
		 * -exam will trick you with string and string builder immutability
		 * -you can also chain method with string builder
		 * -chaining string builder method will not produce new string objects. it will return the 
		 * same string builder
		 */
		
		
		// with string builder
		StringBuilder sb = new StringBuilder(); // create new instance of StringBuilder object
		
		for(char c = 'a'; c <= 'z'; c++) {
			sb.append(c); // add char to string builder, reuses string builder without creating string each time
		}
		System.out.println(sb);
		
		// exam will trick you about string builder mutability
		
		StringBuilder builder = new StringBuilder("start");
		builder.append("-middle"); // "start-middle"
		StringBuilder anotherBuilder = builder.append("-end");
		
		System.out.println(builder);
		System.out.println(anotherBuilder);
		
		System.out.println(builder == anotherBuilder);
		System.out.println(System.identityHashCode(builder));
		System.out.println(System.identityHashCode(anotherBuilder));
		
		
		StringBuilder myBuilder = new StringBuilder();
		System.out.println("size= " + myBuilder.length());
		System.out.println("capacity= " + myBuilder.capacity());
		
		
		myBuilder = new StringBuilder(100);
		System.out.println("size= " + myBuilder.length());
		System.out.println("capacity= " + myBuilder.capacity());
		
		myBuilder.append("MyNewTest");
		System.out.println("size= " + myBuilder.length());
		System.out.println("capacity= " + myBuilder.capacity());
		
		/*
		 * if we go over 100 capacity (append until exceed 100), java will automatically
		 * increase the capacity
		 * 
		 */
		
		StringBuilder a = new StringBuilder("This ");
		StringBuilder b = a.append("Java ");
		b = b.append("is").append(" so ").append("Cool");
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
