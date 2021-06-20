package kodlama.io.manager;

import kodlama.io.abstracts.EDevletLogin;
import kodlama.io.abstracts.GamePromotion;
import kodlama.io.abstracts.GameSales;
import kodlama.io.models.Game;
import kodlama.io.models.GamePlayer;

public class GameSalesManager implements GameSales {
	
	EDevletLogin eDevletLogin;
	GamePromotion gamePromotion;

	public GameSalesManager(EDevletLogin eDevletLogin, GamePromotion gamePromotion) {
		super();
		this.eDevletLogin = eDevletLogin;
		this.gamePromotion = gamePromotion;
	}

	@Override
	public boolean addToChart(GamePlayer gamePlayer, Game game) {
		if(eDevletLogin.isAccount(gamePlayer)) {
			System.out.println("Hi " + gamePlayer.getName() + ", game added to your chart.");
			if(gamePromotion.addPromotion(game)) {
				System.out.println(game.getGameName() + " game can used with promotion code "
						  + game.getGameCode()); 
			}
			return true;
		}
		return false;
	}

}
