package operators;

/*
 * -what are compound assignment operators
 * -how to use compount assignment operators
 * -common errors
 */

public class compound_assignment_operators {

	public static void main(String[] args) {
		
		int x = 2;
		int z = 3;
		
		x = x * z; // simple assignment
		x *= z; // compound assignment
		
		System.out.println("x= "+ x);
		
//		int a += 5; // does not compile
		
		// withour explicit cast
		long a = 10;
		int b = 4;
//		b = b * a; // does not compile
//		b = (int) (b * a);
		b *= a; // short for b = (int) (b * a);
		
		System.out.println("b= " + b);
		
		long c = 4;
		long d = (c = 2);
		
		System.out.println("c= " + c + "\nd= " + d);
		
		long e = 3;
		long f = 2;
		long h = 1;
		
		long i = e + 3 * (f = 3) - (h -= 2);
		
		System.out.println("e= " + e);  // Prints the value of e
	    System.out.println("f= " + f);  // Prints the value of f after it was modified in the computation for i
	    System.out.println("h= " + h);  // Prints the value of h after it was modified in the computation for i
	    System.out.println("i= " + i);  // Prints the computed value of i


	}

}
