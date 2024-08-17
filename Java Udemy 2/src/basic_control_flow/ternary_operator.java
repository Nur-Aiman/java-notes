package basic_control_flow;

/*
 * we will learn about : 
 * -what is ternary operator
 * -how to use ternary operator
 * -tricky question
 */

public class ternary_operator {

	public static void main(String[] args) {
		
		/*
		 * -ternary operator is use to replace simple if else statement
		 * -the first operand must be boolean expression that you usually put inside the if statement
		 * -the second and third operator can be any expression that returns a value
		 * -
		 */
		
		int x = 10;
		int y;
		
		if(x > 5) {
			y = 2 * x;
		} else { 
			y = 4 * x;
		}
		
		System.out.println("y= " + y);
		
		// ternary operator
		// ? is if
		// : is else
//		y = x > 5 ? 2 * x : 4 * x;
		
		y = (x > 5) ? (2 * x) : (4 * x);
		
		System.out.println("y= " + y);
		
		/*
		 * the second and third operand inside the if statement can have different
		 * types but if it used with assignment operator, then they need to have
		 * the same data type
		 * 
		 * this is example of assignment. we are assigning new value to y : 
		 * y = (x > 5) ? (2 * x) : (4 * x);
		 * 
		 * with assignment operator we need to use the same data type on both operands
		 * 
		 */
		
		y = 1;
		// different data type example
		System.out.println(y > 5 ? 10 : "Test");
		
//		int myInt = y < 10 ? 5 : "Test"; // does not compile

		// ternary operator work similar with short circuit 
		// operator (&&, ||, ^). They only evaluate the first expression.
		// The second expression is evaluated only if it is needed.
		// Only 1 expressions will be evaluated
		
		int a = 1;
		int b = 1;
		int c = a < 10 ? a++: b++;
		
		System.out.println(a + ", " + b + ", " + c);
		
	}

}
