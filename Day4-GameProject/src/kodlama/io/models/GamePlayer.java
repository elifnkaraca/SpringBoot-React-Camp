package kodlama.io.models;

public class GamePlayer {
	
	private String tckn;
	private String name;
	private String surname;
	private String birthOfDate;
	
	public GamePlayer() {
		super();
	}

	public GamePlayer(String tckn, String name, String surname, String birthOfDate) {
		super();
		this.tckn = tckn;
		this.name = name;
		this.surname = surname;
		this.birthOfDate = birthOfDate;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(String birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	

}
