package Polymorphism;

public class Test {
	public static void main(String[] args) {
		Student[] studentArray= {
				new GraduteStudent("Rimon","CSC",60,60),
				new UndergraduteStudent("Mazed","SWE",67),
				new GraduteStudent("Fahad","EEE",45,70),
				new UndergraduteStudent("Anwar","IT",33)
		};
		
		for(Student student:studentArray) {
			System.out.println(student.toString());
			//student.getStudentInfo(); // static binding
		}
	}
}
