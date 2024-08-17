package operators;

/*
 * we will learn about : 
 * -conditional (short-circuit logical) operators(&&, ||)
 * -exclusive OR operator ^
 * -truth tables
 * -tricky questions
 */

public class conditional_operators {

	public static void main(String[] args) {
		// for the exclusive OR operator (x^y), they
		// are true when they are different
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = a && b; // false
		boolean e = a || b; // true
		
		System.out.println("d= " + d + "\ne= " + e);
		
		int f = 4;
		boolean g = false && (f++ < 4);
		boolean h = (f-- == 4) && !g; // true and !g, true and true
		
		System.out.println("f= " + f);
		System.out.println("g= " + g);
		System.out.println("h= " + h);
		
		int myInt = 3;
		int anotherInt = 4;
		boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
		// (myInt <= 3) -> true
		// (anotherInt-- == 4) -> true
		// (myInt++ == 4) -> 
		
		System.out.println("myInt= " + myInt);
		System.out.println("anotherInt= " + anotherInt);
		System.out.println("myBoolean= " + myBoolean);
		
		boolean x = true, z = false;
		int y = 20;
		x = (y != 10) ^ (z = false);
		// true ^ false -> true
		
		System.out.println(x + ", " + y + ", " + z);

	}

}
