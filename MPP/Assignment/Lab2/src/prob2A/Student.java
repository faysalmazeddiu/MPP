package prob2A;

public class Student {
	
	private String name;
	private GradeReport gradeReport;
	public Student(String name,String gpa){
		this.name=name;
		gradeReport=new GradeReport(this,gpa);
	}
	
	public GradeReport getReport() {
		return this.gradeReport;
	}
	
	public String getName() {
		return this.name;
	}

}
