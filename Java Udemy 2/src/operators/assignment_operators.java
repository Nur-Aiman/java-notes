package operators;

/*
 * we will learn : 
 * -what is assignment operators
 * -how to use assignment operators
 * -what is overflow and underflow
 */

public class assignment_operators {

	public static void main(String[] args) {
//		int x = 1.0; // does not compile
//		short y = 3213213; // does not compile
//		int z = 9f; // does not compile
//		long t = 321321321321323243; // does not compile
		
		// casting
		// casting is required when you go from large
		// numerical datatype to smaller numerical data type (primitive)
		// kecik nak masuk besar boleh masuk terus
		// besar nak masuk kecik kene convert dulu guna ( )
		int x = (int) 1.0; 
		short y = (short) 3213213;
		int z = (int) 9f; 
		long t = 321321321321323243L; 
		
		int h = (int) t;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y); // overflow
		System.out.println("z= " + z);
		System.out.println("t= " + t);
		
		// overflow and underflow with byte (-128 to 127)
		byte myByte = 127;
		byte mySecondByte = -128;
		
		System.out.println("myByte = " + myByte);
		System.out.println("mySecondByte = " + mySecondByte);
		
//		myByte = myByte + 1; // does not compile
		myByte++;
		
//		mySecondByte = mySecondByte - 1; // does not compile
		mySecondByte--;
		

		System.out.println("myByte = " + myByte);
		System.out.println("mySecondByte = " + mySecondByte);

		short a = 10;
		short b = 20;
//		short c = a * b; // does not compile
		short c = (short) (a * b);
		System.out.println("c= " + c);

	

	}

}
