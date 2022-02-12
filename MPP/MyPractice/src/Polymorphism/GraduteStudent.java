package Polymorphism;

public class GraduteStudent extends Student{
	private int projectMark;
	private int finalTesisMark;
	public GraduteStudent(String name,String dept,int projectMark,int finalTesisMark){
		super(name,dept);
		this.projectMark=projectMark;
		this.finalTesisMark=finalTesisMark;
		
	}
	
	public int calculateGPA() {
		return super.calculateGPA()+projectMark+finalTesisMark;
	}
	
	public static void getStudentInfo() {
		System.out.println("Your are  Gradute Student");	
	}

	@Override
	public String toString() {
		return "GraduteStudent [name=" + name + ", dept=" + dept + ", calculateGPA()=" + calculateGPA() + "]";
	}
	
	
}
