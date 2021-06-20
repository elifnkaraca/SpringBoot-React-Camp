package kodlama.io.abstracts;

import kodlama.io.models.Game;

public interface GamePromotion {
	
	boolean addPromotion(Game game);
	void removePromotion(Game game);
	void updatePromotion(Game game);

}
