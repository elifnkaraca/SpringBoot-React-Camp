package kodlama.io.manager;

import kodlama.io.models.Student;

public class StudentManager extends UserManager {
	
	public void homework(Student student) {
		System.out.println(student.getStudentNo() + " ödevini tamamladý.");
	}

}
