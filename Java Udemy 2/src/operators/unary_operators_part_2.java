package operators;

public class unary_operators_part_2 {

	public static void main(String[] args) {
		
		// increment and decrement have higher order than
		// all arithmetic operator
		
		int myInt = 5;
		int otherInt = ++myInt;
		System.out.println("myInt= " + myInt + "\notherInt= " + otherInt);
		
		int newInt = 5;
		int newOtherInt = newInt++;
		System.out.println("newInt= " + newInt + "\nnewOtherInt= " + newOtherInt);
		
		int count = 0;
		System.out.println("count : ");
		System.out.println(count);
		System.out.println(++count);
		System.out.println(count);
		System.out.println(count--);
		System.out.println(count);
		
		// exam question
		int e = 3;
		int f = ++e * 5 / e-- + --e;
		// 4 * 5 / e-- + --e; -> ++e -> ++3 -> e=4
		// 4 * 5 / 4 + --e; -> e-- -> 4-- -> e=3
		// 4 * 5 / 4 + 2; -> --e -> --3 -> e=2
		System.out.println("e= " + e + "\nf= " + f);
		
		int g = 6;
		int h = 2;
		int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
		// h = 3 g = 6
		// 3 + --g * 3 + 2 * g++ - h-- % --g;
		// h = 3 g = 5
		// 3 + 5 * 3 + 2 * g++ - h-- % --g;
		// h = 3 g = 5
		// 3 + 5 * 3 + 2 * 5 - h-- % --g;
		// h = 3 g = 6
		// 3 + 5 * 3 + 2 * 6 - 3 % --g;
		// h = 2 g = 6
		// 3 + 5 * 3 + 2 * 6 - 2 % 5;
		
		System.out.println("g= " + g);  // Prints the value of g
        System.out.println("h= " + h);  // Prints the value of h
        System.out.println("i= " + i);
		
		
		

	}

}
