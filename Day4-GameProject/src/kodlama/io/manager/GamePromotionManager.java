package kodlama.io.manager;

import kodlama.io.abstracts.GamePromotion;
import kodlama.io.models.Game;

public class GamePromotionManager implements GamePromotion {

	@Override
	public boolean addPromotion(Game game) {
		System.out.println(game.getGameName() + " promotion added with promotion code " + game.getGameCode() );
		return true;
		
	}

	@Override
	public void removePromotion(Game game) {
		System.out.println(game.getGameName() + "promotion removed");
		
	}

	@Override
	public void updatePromotion(Game game) {
		System.out.println(game.getGameName() + "promotion infos updated successfully");
		
	}


}
