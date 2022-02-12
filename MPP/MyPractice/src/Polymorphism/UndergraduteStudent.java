package Polymorphism;

public class UndergraduteStudent extends Student{
	private int projectMark;
	
	public UndergraduteStudent(String name, String dept,int projectMark) {
		super(name, dept);
		this.projectMark=projectMark;
	}
	
	public int calculateGPA() {
		return super.calculateGPA()+projectMark;
	}
	
	public static void getStudentInfo() {
		System.out.println("Your are  UnderGradute Student");	
	}

	@Override
	public String toString() {
		return "UndergraduteStudent [name=" + name + ", dept=" + dept + ", calculateGPA()=" + calculateGPA() + "]";
	}

}
