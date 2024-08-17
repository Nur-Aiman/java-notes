package class_design.data_encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class company {
	
	// -POJO (Plain Old Java Object)
	// -encapsulation - can simply change data/method here
	// without affecting the data_encapsulation.java class
	// -user won't know what happen behind the scene
	String name;
	List<String> employees = new ArrayList();
	
//	public company() {}
	
	public void printSorted() {
		System.out.println("companyName= " + name);
		Collections.sort(employees);
		System.out.println("sorted= " + employees);
	}
	
	public void setName(String name) {
		if(name == null) {
			System.out.println("name can't be null");
		} else {
		this.name= name; 
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void addEmployee(String name) {
		if(name == null || name.isEmpty()) {
			System.out.println("can't add null employee");
			
		} else {
		employees.add(name);
		}
	}

}


