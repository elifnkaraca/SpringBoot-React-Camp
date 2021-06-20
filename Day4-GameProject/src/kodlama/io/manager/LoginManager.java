package kodlama.io.manager;

import kodlama.io.abstracts.EDevletLogin;
import kodlama.io.models.GamePlayer;

public class LoginManager implements EDevletLogin {
	
	
	@Override
	public boolean isAccount(GamePlayer gamePlayer) {
		if(gamePlayer.getName() != null && gamePlayer.getSurname() != null
				&& gamePlayer.getTckn() != null && gamePlayer.getBirthOfDate() != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void createAccount(GamePlayer gamePlayer) {
		
		if(isAccount(gamePlayer)) {
			System.out.println("Your account is created successfully");
		} else {
			System.out.println("Fail. Please check your informations.");
		}
		
	}
	
	public void updatePlayerInfo(GamePlayer gamePlayer) {
		System.out.println("Hi " + gamePlayer.getName() + ", your account informations updated successfully");
	}
	
	public void deleteAccount(GamePlayer gamePlayer) {
		System.out.println("Hi " + gamePlayer.getName() + ", your account deleted succesfully" );
		
	}

	
}
