package basic_control_flow;

/*
 * we will learn about : 
 * -how to use do-while loop
 * -differences between do-while and while
 * -when to use do-while
 * -tricks
 */

public class do_while_loop {

	public static void main(String[] args) {
		
		int a = 0;
		
		do {
			a++;
		} while (false);
		
		System.out.println("a= " + a);
		
//		while (false) {
//			a++; // not compile. state is unreachable
//		}
		
//		while (true) {
//			a++;  // endless loop
//		}
		
		int x = 20;
		
		while (x > 10) x--;
		System.out.println("x= " + x);
		
		int x2 = 20;
		
		do x2--; while (x2 > 10);
		
		System.out.println("x2= " + x2);
		
		int y = 10;
		int z = 5;
		while (y < 20)
			y++;
			z+=2; // not in while loop
			y+=10; // not in while loop
			
		System.out.println("x= " + x + "y= " + y + "z= " + z);
		
		
		int number = 10;
		
		while (number > 10) {
			number--;
		}
		
		do {
			number--;
			
			while (number > 5) {
				number -= 2;
			}
		} while (number > 10);
		
		System.out.println("number= " + number);
		

	}

}
