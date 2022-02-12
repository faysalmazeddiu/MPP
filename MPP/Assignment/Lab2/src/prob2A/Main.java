package prob2A;

public class Main {
	public static void main(String[] args) {
		Student student=new Student("Mazed","B");
		Student student2=new Student("Illius","A");
		Student student3=new Student("Modi","A");
		
		System.out.println(student.getName()+"===="+student.getReport().getGpa());
		System.out.println(student2.getName()+"===="+student2.getReport().getGpa());
		System.out.println(student3.getName()+"===="+student3.getReport().getGpa());
		
	}
}
