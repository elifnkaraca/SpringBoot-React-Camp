package kodlama.io.models;

public class Instructor extends User {
	
	private String branchName;
	private String workPhone;
	
	public Instructor(int id, String firstname, String lastname, String email, String branchName, String workPhone) {
		super(id, firstname, lastname, email);
		this.branchName = branchName;
		this.workPhone = workPhone;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	
	

}
