package gameProject.business.concretes;

import gameProject.business.abstracts.SaleService;
import gameProject.entities.concretes.Campaing;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void Sell(Game game, Gamer gamer) {
		if(game.getPrice() > gamer.getMoney()) {
			System.out.println(game.getName() + " oyunu için bakiyeniz yetersiz.");
		}else {
			System.out.println(gamer.getFirstName() + ";" + game.getName() + " satýn aldýnýz.");
		}
		
		 double currentMoney = gamer.getMoney() - game.getPrice();
	     gamer.setMoney(currentMoney);
	     System.out.println("Kalan bakiyeniz: " + gamer.getMoney());
		
	}

	@Override
	public void SellWithCampaing(Game game, Gamer gamer, Campaing campaing) {
		double newPrice = game.getPrice() - ((campaing.getDiscount() / 100)* game.getPrice());
		game.setPrice(newPrice);
		
		if(game.getPrice() > gamer.getMoney()) {
			System.out.println(game.getName() + " oyunu için bakiyeniz yetersiz.");
		}else {
			System.out.println(gamer.getFirstName() + ";" + game.getName() + " satýn aldýnýz.");
		}
		
		double currentMoney = gamer.getMoney() - game.getPrice();
	     gamer.setMoney(currentMoney);
	     System.out.println("Kalan bakiyeniz: " + gamer.getMoney());
		
	}

}
