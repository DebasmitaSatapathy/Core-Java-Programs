package generalprograms;

import java.util.ArrayList;
import java.util.List;

class Student {
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class ExecuteStudent {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		for(int studentCount = 1 ; studentCount <=200 ;studentCount++ ) {
			Student student = new Student(100 + studentCount , "mama" + studentCount, 38 + studentCount);
			studentList.add(student);
		}
		for (Student student : studentList) {
			System.out.println("id: " + student.id + "  Name : " + student.name + "  Age : " + student.age);
		}

	}

}
