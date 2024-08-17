package methods;

/*
 * we will learn : 
 * -what are parameters
 * -how to write methods with parameters
 */

public class method_parameter_list {

	public static void main(String[] args) {
		
		int getZero() { // 0 arguments (niladic)
			return 0;
		}
		
		int increment(int number) { // 1 argument (monadic)
			return number + 1;
		}
		
		int sum(int a, int b) {  // 2 arguments (diadic)
			return a + b;
		}
		
		int plusMinus(int a, int b, int c) { // 3 arguments (triadic)
			return a + b - c;
		}
		
		double average(double a, double b, double c, double d) {  // 4 arguments (polyadic)
			return (a+b+c+d) /4.0;
		}
		
//		void test {} // will not compile because there is no '()' in arguments
		
//		void test(int a; int b) {} // does not compile due to ';'
		
		void test(int a, int b) {}
		
//		void test2(int a); // not compile because we are missing method body
		
		
	}

}
