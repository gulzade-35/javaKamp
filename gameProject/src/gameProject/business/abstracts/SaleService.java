package gameProject.business.abstracts;

import gameProject.entities.concretes.Campaing;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Gamer;

public interface SaleService {
	void Sell(Game game, Gamer gamer);
	void SellWithCampaing(Game game, Gamer gamer, Campaing campaing );
}
