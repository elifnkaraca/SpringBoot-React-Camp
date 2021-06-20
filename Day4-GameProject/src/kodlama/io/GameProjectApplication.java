package kodlama.io;

import kodlama.io.manager.GamePromotionManager;
import kodlama.io.manager.GameSalesManager;
import kodlama.io.manager.LoginManager;
import kodlama.io.models.Game;
import kodlama.io.models.GamePlayer;

public class GameProjectApplication {

	public static void main(String[] args) {
		
		LoginManager loginManager = new LoginManager();
		GamePromotionManager gamePromotionManager = new GamePromotionManager();
		
		GamePlayer firstPlayer = new GamePlayer("1111111", "Elif", "Karaca", "1997");
		Game game = new Game("Fortnite", "123456");
		loginManager.createAccount(firstPlayer);
		loginManager.deleteAccount(firstPlayer);
		loginManager.updatePlayerInfo(firstPlayer);
		
		GameSalesManager gameSalesManager = new GameSalesManager(loginManager, gamePromotionManager);
		gameSalesManager.addToChart(firstPlayer, game);
		
		
		}
}
