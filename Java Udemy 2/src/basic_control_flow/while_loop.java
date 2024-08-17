package basic_control_flow;

/*
 * we will learn : 
 * -the while loop structure
 * -how to use while loop
 * -tricky question
 */

public class while_loop {

	public static void main(String[] args) {
		int spaceOnHdd = 5;
		
		while (spaceOnHdd > 0) {
			spaceOnHdd--;
			System.out.println("spaceOnHdd= " + spaceOnHdd);
		}
		
		int x = 2;
		int y = 5;
		
		while(x < 10) {
			y++;
			x++;
		}
		
		System.out.println("x= " + x + "\ny= " + y);
		
		int a = 5;
		int b = 7;
		
		
		// a is less than 6
		while (a > 6) {
			b += 2;
			a++;
		}
		
		a = a > 6 ? a++ : b--;
		// false
		// a=b-> a=7
		// b-- -> b=b-1 -> b=6
		// 7 + 6 = 13
		
		System.out.println(a + ", " + b + ", " + (a + b)); // 7, 6, 13
		

	}

}
