package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	
 String id;
 String fname;
 String lname;
 int salary;
 
 public Employee(String id, String fname, String lname, int salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	} 
 
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public int compareTo(Employee emp) {
	if(this.salary < emp.salary) {
		return -1;
	}else if (this.salary > emp.salary) {
		return 1;
	}else {
		return 0;
	}
}	

@Override
	public String toString() {		
		return Integer.valueOf(salary).toString();
	}

}

public class ComparableWithSalary {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("101","Rajveer","Barik",2000000),
				new Employee("102","Satya","Barik",10000000),
				new Employee("103","Debasmita","Satapathy",1500000),
				new Employee("105","Biswanath","Barik",800000),
				new Employee("104","Laxmipriya","Behera",1300000)));
		
		System.out.println("Employee List: " + employees);
		Collections.sort(employees);
		System.out.println("Employee List: " + employees);
	}
	
	

}
