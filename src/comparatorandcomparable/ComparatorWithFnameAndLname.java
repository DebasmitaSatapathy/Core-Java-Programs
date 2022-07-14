package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	
 String id;
 String fname;
 String lname;
 int salary;
 
 public Person(String id, String fname, String lname, int salary) {
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

//@Override
//	public String toString() {		
//		return "{Id: " + id + " , Fname: "+fname+" , Lname: " +lname+ ", Salary: " + salary + "}";
//	}

@Override
public String toString() {		
	return "{"+lname + " " + fname + "}";
}

}


public class ComparatorWithFnameAndLname {
	
	static class PersonComparator implements Comparator<Person>{

		@Override
		public int compare(Person p1, Person p2) {
			int compareResult = p1.lname.compareTo(p2.lname);
			if(compareResult != 0) {
				return compareResult;
			}else {
				return p1.fname.compareTo(p2.fname);								
			}			
		}
		
	}

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>(Arrays.asList(new Person("101","Rajveer","Barik",2000000),
				new Person("102","Satya","Barik",10000000),
				new Person("103","Debasmita","Satapathy",1500000),
				new Person("105","Biswanath","Barik",800000),
				new Person("104","Laxmipriya","Behera",1300000)));
		
		System.out.println("Employee List: " + persons);
		Collections.sort(persons,new PersonComparator());		
		System.out.println("Employee List: " + persons);
		
	}
	
	

}
