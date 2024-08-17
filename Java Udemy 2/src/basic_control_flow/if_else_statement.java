package basic_control_flow;

/*
 * learn about : 
 * -if else statement structure
 * -how to use if else
 * -tricky code
 */

public class if_else_statement {

	public static void main(String[] args) {
		
		boolean b = true;
		
		if(b) {
			System.out.println("true");
		} else { 
			System.out.println("false");
		}
		
		int x = 1;
//		if(x) // does not compile cause we need true or false in the () of if
//		if(x=1) // does not compile cause we are assigning the value 1 to x
		if (x == 1) {} // will compile
		
		int testScore = 90;
		char grade;
		
		if(testScore >= 90) {
			grade = 'A';
		} else if(testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else if (testScore >= 50) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		
		System.out.println("grade = " + grade);
		
		int hourOfDay = 10;
		if(hourOfDay < 11) System.out.println("Morning");
		else if(hourOfDay < 17) System.out.println("Evening");
		else
			System.out.println("Day");
		    hourOfDay++; // this is not inside the 'else' block
		    
		if(hourOfDay < 17) {
			System.out.println("Afternoon");
		} else if (hourOfDay < 11) {  // 11 is less than 17. won't be executed. if input is 10, it will go to the <17 block
			System.out.println("Morning");
		} else { 
			System.out.println("Evening");
		}
		
		

	}

}
