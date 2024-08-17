package java_basics;

import java.util.Date;

/*
 * - learn about naming conflicts and code formatting
 * - learn how to use multiple classes with same name
 * - learn about wildcard imports
 * - learn about how code will be formatted on exam
 */

public class naming_conflicts_and_code_formatting {

	public static void main(String[] args) {
		
		/*
		 * -There are packages that have same class name
		 * -example below, 2 different package have same class name
		 * 
		 * -if write like this : 
		 * import java.util.Date;
		 * import java.sql.Date;
		 * 
		 * we will get compilation error cause we don't know
		 * which Date class we want to use
		 * 
		 * -to avoid confusion, use full class name for both : 
		 *    java.util.Date date;
		 *    java.sql.Date sqlDate;
		 *    
		 * -we cannot import classes from default packages
		 * 
		 */
		
		Date date;
		java.sql.Date sqlDate;
		
		
		/* Code formatting in exam
		 * 
		 * public void checkEmpty(List_list) {
		 * if (list.isEmpty()) {System.out.println("empty");
		 * } else { System.out.println("not empty");
		 * }
		 * 
		 * - it is a good idea to rewrite the code with proper indentation
		 * on paper
		 */
		
		
		

	}

}
