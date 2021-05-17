package kodlama.io;

import kodlama.io.manager.InstructorManager;
import kodlama.io.manager.StudentManager;
import kodlama.io.manager.UserManager;
import kodlama.io.models.Instructor;
import kodlama.io.models.Student;

public class MainApplication {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"elif","karaca","elif@gmail.com","Math","549");
		Student student = new Student(2,"hazal","karaca","hazal@gmail.com",54);
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.homework(student);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework(instructor);
		

	}

}
