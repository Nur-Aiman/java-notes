package class_design.data_encapsulation;

/*
 * we will learn about :
 * -what is data encapsulation
 * -how to encapsulate data
 * -getters and setters
 */

public class data_encapsulation {

	public static void main(String[] args) {
		
		company company = new company();
		// company.name = "MyCompany";
		company.setName("MyCompany");   
//		company.employees.add("John");
		company.addEmployee("John");
//		company.employees.add("Anthony");
		company.addEmployee("Anthony");
		company.addEmployee(null);
		company.addEmployee("");
		
		company.setName(null);
		
		company.printSorted();
		
//		company.name = null;
//		company.printSorted();
		
//		company.employees = null;
		
//		company.employees.add("Jimmy");  // null pointer exception
//		company.printSorted();
		
	}

}
