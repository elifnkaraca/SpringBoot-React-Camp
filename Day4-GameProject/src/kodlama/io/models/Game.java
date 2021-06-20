package kodlama.io.models;

public class Game {
	
	private String gameName;
	private String gameCode;
	
	public Game() {
		super();
	}

	public Game(String gameName, String gameCode) {
		super();
		this.gameName = gameName;
		this.gameCode = gameCode;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	
}
