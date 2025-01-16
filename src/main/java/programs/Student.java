package programs;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	String name;
	int rollno;
	int age;
	
	Student(int rollno,String name,int age){
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
		
		
	}
	
	
	public String toString() {
		
		return"[name=" +this.name + ", RollNo =" + this.rollno + ", age = " +  this.age + "]";
	}
	

	


	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.length()-o2.name.length();
	}
	
	
	
	
}
