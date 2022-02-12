package Polymorphism;

public class Student {
	String name;
	String dept;
	public static final int GRADGE=20;
	public Student(String name, String dept){
		this.dept=dept;
		this.name=name;
	}
	
	public int calculateGPA() {
		return GRADGE;
	}
	
	public static void getStudentInfo() {
		System.out.println("Your are Student");	
	}
	
}
