package kodlama.io.manager;

import kodlama.io.models.*;

public class InstructorManager extends UserManager {
	
	public void addHomework(Instructor instructor) {
		
		System.out.println(instructor.getBranchName()+ " dersine ödev eklendi.");
	}

}
