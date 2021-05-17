package kodlama.io.models;

public class Student extends User {
	
	private int studentNo;
	
	public Student(int id, String firstname, String lastname, String email, int studentNo) {
		super(id,firstname,lastname,email);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

}
