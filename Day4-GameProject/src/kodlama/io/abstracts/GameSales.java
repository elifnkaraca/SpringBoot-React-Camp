package kodlama.io.abstracts;

import kodlama.io.models.Game;
import kodlama.io.models.GamePlayer;

public interface GameSales {
	
	boolean addToChart(GamePlayer gamePlayer, Game game);

}
