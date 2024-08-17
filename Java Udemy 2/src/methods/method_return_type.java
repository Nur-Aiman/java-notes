package methods;

/*
 * we will learn : 
 * -what is method return type
 * -return statement
 * -valid method identifiers
 */

public class method_return_type {

	public static void main(String[] args) {
		
		/*
		 * method return type is type of value that method return
		 */
		
		

	}
	
	public void jump() {}  // return type void
	public void jump2() {  // return type void
		return;  // return statement. this is redundant. it does not do anything
	}
	
	public String jump3() { return ""; } // return empty string
	
//	public String jump4() {} // does not compile because we don't have return statement

//	public jump5() {} // does not compile because we expect a return type
	
	String jump6(int a) {   // does not compile if missing return statement at outside if condition
		if(a == 5) {
			return "";
		}
		return "";
	}
	
	int getInt() {
		return 9;
	}
	
//	int getLong() {   // does not compile because long is not converted automatically to int
//		return 9L;  // need to cast (int) 9L
//	}
	
	int expanded() {
//		int temp = 10;
//		return temp;
		return 10;
	}
	
	boolean isTrue() {
//		return 5 < 10;
		return 5 == 5;
	}
	
	// method names
	public void test() {}
//	public void 2test() {} // invalid name
//	public test void() {}  // cannot use keyword for method name
//	public void void() {} // cannot use keyword for method name
//	public void public() {} // cannot use keyword for method name
	
	public void $test() {}
	public void _test() {}
	
//	public void() {} // does not compile

}
