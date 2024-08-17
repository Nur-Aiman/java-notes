package operators;

/*
 * learn about : 
 * -what is numeric promotion
 * -rules for numeric promotion
 * -converting primitives (casting)
 */

public class unary_operators_part_1 {

	public static void main(String[] args) {
		
		int x = +3; // + sign is redundant
		
		System.out.println("x= " + x);
		
		double y = -x;
		System.out.println("x= " + x + "\ny= " + y);
		
		y = -y;
		System.out.println("x= " + x + "\ny= " + y);
		
		boolean a = true;
		boolean b = !a;
		
		System.out.println("a= "+ a + "\nb= "+ b);
		
		/*
		 * in java, 1 and true is not related, and 0 and
		 * false also not related
		 */
		
//		int myInt = !5; // not compile 
//		boolean myBoolean = -true // not compile
//		boolean z = !0; // not compile
		
		
		
		

	}

}
