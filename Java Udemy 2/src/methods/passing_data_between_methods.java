package methods;

/*
 * we will learn about : 
 * -passing data between methods
 * -pass by value
 */

public class passing_data_between_methods {

	public static void main(String[] args) {
		int number = 4;
		System.out.println("number= " + number);
		newNumber(5);
		System.out.println("number= " + number);
		
		String name = "Jimmy";
		System.out.println("name= " + name);
		newName(name);
		System.out.println("name= " + name);
		
		StringBuilder sb = new StringBuilder();
		
		StringBuilder s = sb;
		s.append("Anthony");
		
		
		build(sb);
		System.out.println("s= " + s);
		System.out.println("stringBuilder= " + sb);
	}
	
	public static void newNumber(int number) {
		System.out.println("in newNumber number= " + number);
		number = 10;
		System.out.println("in newNumber number= " + number);
	}
	
	public static void newName(String name) {
		System.out.println("in newName name= " + name);
		name = "Timmy";
		System.out.println("in newName name= " + name);

	}
	
	public static void build(StringBuilder s) {
//		s = new StringBuilder(); 
		s.append("Tom");
	}

}
