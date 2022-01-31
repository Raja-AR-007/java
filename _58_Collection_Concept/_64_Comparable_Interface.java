package com.Concepts.Collection_Concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//                              Printing Details of Student using 'List'
/*  
class Student {  
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo= rollNo;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {  // used to print the values of variables
		return "Student[rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
}
public class Comparable_Interface {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<>();
		students.add(new Student(4,"raja",150));
		students.add(new Student(9," gowri sankar ",134));
		students.add(new Student(3,"guganesh",145));
		students.add(new Student(1,"praveen",165));
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}*/

/*
output:
Student[rollNo=4, name=raja, marks=150]
Student[rollNo=9, name= gowri sankar , marks=134]
Student[rollNo=3, name=guganesh, marks=145]
Student[rollNo=1, name=praveen, marks=165]

*/

//                                       sorting the Student's marks
//if we want sort() Method i want to implements Comparable<Student> in Class
/*
class Student implements Comparable<Student>{  
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo= rollNo;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {  // used to print the values of variables
		return "Student[rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	// compareTo() Method belongs to Comparable<Student>
	public int compareTo(Student s) {  // used to compare the values of variables
		return marks > s.marks ? 1 : -1;  // sorting the Student's marks
	}
}
public class Comparable_Interface {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<>();
		students.add(new Student(4,"raja",150));
		students.add(new Student(9," gowri sankar ",134));
		students.add(new Student(3,"guganesh",145));
		students.add(new Student(1,"praveen",165));
		
		Collections.sort(students);  //if i want sort() Method i want to implements Comparable<Student> in Class
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}*/

/*
output:
Student[rollNo=9, name= gowri sankar , marks=134]
Student[rollNo=3, name=guganesh, marks=145]
Student[rollNo=4, name=raja, marks=150]
Student[rollNo=1, name=praveen, marks=165]
*/

//                                          sorting the Student's name
//if we want sort() Method i want to implements Comparable<Student> in Class
/*
class Student implements Comparable<Student>{  // if i want sort() Method i want to implements Comparable
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo= rollNo;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {  // used to print the values of variables
		return "Student[rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	// compareTo() Method belongs to Comparable<Student>
	public int compareTo(Student s) {  // used to compare the values of variables
		return name.length() > s.name.length() ? 1 : -1;  // sorting the Student's name
	}
}
public class Comparable_Interface {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<>();
		students.add(new Student(4,"raja",150));
		students.add(new Student(9," gowri sankar ",134));
		students.add(new Student(3,"guganesh",145));
		students.add(new Student(1,"praveen",165));
		
		Collections.sort(students);  //if i want sort() Method i want to implements Comparable<Student> in Class
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}*/

/*
output:
Student[rollNo=4, name=raja, marks=150]
Student[rollNo=1, name=praveen, marks=165]
Student[rollNo=3, name=guganesh, marks=145]
Student[rollNo=9, name= gowri sankar , marks=134]
*/

//                                       sorting the Student's rollNo
//if we want sort() Method i want to implements Comparable<Student> in Class
/*
class Student implements Comparable<Student>{  // if i want sort() Method i want to implements Comparable
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo= rollNo;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {  // used to print the values of variables
		return "Student[rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	// compareTo() Method belongs to Comparable<Student>
	public int compareTo(Student s) {  // used to compare the values of variables 
		return rollNo > s.rollNo ? 1 : -1;  // sorting the Student's rollNo
	}
}
public class Comparable_Interface {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<>();
		students.add(new Student(4,"raja",150));
		students.add(new Student(9," gowri sankar ",134));
		students.add(new Student(3,"guganesh",145));
		students.add(new Student(1,"praveen",165));
		
		Collections.sort(students);  //if i want sort() Method i want to implements Comparable<Student> in Class
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}*/

/*
output:
Student[rollNo=1, name=praveen, marks=165]
Student[rollNo=3, name=guganesh, marks=145]
Student[rollNo=4, name=raja, marks=150]
Student[rollNo=9, name= gowri sankar , marks=134]
*/

// Even if we have 'Comparable' we can @Override with the help of 'Comparator Object'

class Student implements Comparable<Student>{  // if i want sort() Method i want to implements Comparable
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo= rollNo;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {  // used to print the values of variables
		return "Student[rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	// compareTo() Method belongs to Comparable<Student>
	public int compareTo(Student s) {  // used to compare the values of variables 
		return rollNo > s.rollNo ? 1 : -1;  // sorting the Student's rollNo
	}
}
public class _64_Comparable_Interface {

	public static void main(String[] args) {
		
		List<Student> students= new ArrayList<>();
		students.add(new Student(4,"raja",150));
		students.add(new Student(9," gowri sankar ",134));
		students.add(new Student(3,"guganesh",145));
		students.add(new Student(1,"praveen",165));
		
		Collections.sort(students,(i,j) -> i.marks>j.marks?1:-1);  // Comparator Object within the Argument
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}

/*
output:
Student[rollNo=9, name= gowri sankar , marks=134]
Student[rollNo=3, name=guganesh, marks=145]
Student[rollNo=4, name=raja, marks=150]
Student[rollNo=1, name=praveen, marks=165]
 */
