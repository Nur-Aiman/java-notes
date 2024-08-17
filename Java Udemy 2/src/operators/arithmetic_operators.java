package operators;

/*
 * learn about : 
 * -arithmetic operators
 * -modulus operator
 * -changing precedence
 */

public class arithmetic_operators {

	public static void main(String[] args) {
		
		// arithmetic operator
		int result = 3 - 2 + 2 * 2 + 3;
		// 3 - 2 + 4 + 3
		// 1 + 4 + 3
		// 8
		
		System.out.println("results= " + result);
		
		int result1 = 4 / 2 + 1 - 4 * 2 + 10;
		// 2 + 1 - 8 + 10
		// 3 - 8 + 10
		// 5
		System.out.println(result1);
		
		// unary operator
		int a = 4;
		int b = 3 - 2 * --a; // --a is same as a = a - 1;
		System.out.println("a= " + a + "\nb= " + b);
		
		a = 4;
		b = 3 - 2 * a--; // use a then decrement
		// 3 - 2 * 4
		// -5
		System.out.println("a= " + a + "\nb= " + b);
		
		long c = 2;
		long d = 4 + 3 * c++;
		
		System.out.println("c= "+c+"\nd= "+d);
		
		int result2 = 10 - 3 * (2 + 1) - 4/(1+3);
		System.out.println("result= "+result);
		
		int k = 10 % 3;
		int e = 10 % 2;
		
		System.out.println("k= " + k + "\ne= " + e);
		
		int m = 12/2 - 10 % (4 + 3 ) - 2* 12%5 - 2*3;
		// 12/2 - 10%7 - 2 * 12 % 5 - 2*3
		// 6 - 3 - 24 % 5 - 6
		// 6 - 3 - 4 - 6
		// -7
		
		System.out.println("m= " + m);
		

	}

}
