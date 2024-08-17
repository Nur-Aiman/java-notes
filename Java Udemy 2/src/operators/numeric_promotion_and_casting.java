package operators;

/*
 * -what is numeric promotion
 * -rules for numeric promotion
 * -converting primitives (casting)
 */

public class numeric_promotion_and_casting {

	public static void main(String[] args) {
		
		/*
		 * automatic type conversion
		 * -promotion is converting "smaller" to "bigger" type
		 * 
		 */
		
		int x = 5;
		double y = 10.55;
		
		System.out.println("x + y = "+ (x + y));
		
		byte b = 10;
		int c = 5;
		double d = 4.5;
		double result = b + c + d;
		System.out.println("result= " + result);
		
		// casting is converting "bigger" type to smaller type
		
		double myDouble = 5.55;
//		int myInt = 4 + myDouble; // compilation error 
		
		// convert double to int, we will lose the 0.55
		int myInt = 4 + (int)myDouble;
		
		System.out.println("result= " + myInt);
		
		int anotherInt = 125;
		byte myByte = 15;
		
		int intResult = anotherInt + myByte;
//		byte byteResult = anotherInt + myByte; // compilation error because we try to change int to byte
		byte byteResult = (byte)(anotherInt + myByte);
		
		System.out.println("intResult= "+intResult);
		System.out.println("byteResult= "+byteResult); // overflow
		
		/*
		 * sample exam question : 
		 * 1) what is the data type of x + y?
		 * double x = 44.25;
		 * float y = 3.35;
		 * 
		 * ans : won't compile cause floating point literal are assume to
		 * be double (3.35) unless there is letter f (3.35f)
		 * 
		 * 2) what is the data type of x/y?
		 * short x = 14;
		 * short y = 6;
		 * 
		 * ans : int
		 * 
		 * 3) what is the data type of x * y / z?
		 * short x = 14;
		 * float y = 13f;
		 * double z = 30;
		 * 
		 * ans : double
		 */

	}

}
