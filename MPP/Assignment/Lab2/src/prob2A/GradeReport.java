package prob2A;

public class GradeReport {
	private String gpa;
	private Student student;
	GradeReport(Student student,String gpa){
		this.student=student;
		this.gpa=gpa;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public String getGpa() {
		return this.gpa;
	}
	
}
