package gameProject;

import gameProject.adapters.MernisAdapter;
import gameProject.business.concretes.GameManager;
import gameProject.business.concretes.GamerManager;
import gameProject.business.concretes.SaleManager;
import gameProject.entities.concretes.Campaing;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		Game game = new Game();
		MernisAdapter mernisAdapter = new MernisAdapter();
		Campaing campaing = new Campaing();
		GamerManager gamerManager = new GamerManager();
		GameManager gameManager = new GameManager();
		SaleManager saleManager = new SaleManager();
		
		game.setId(1);
		game.setName("Sims");
		game.setPrice(300);
		
		gamer.setId(1);
		gamer.setFirstName("Gülzade");
		gamer.setLastName("Odabaþ");
		gamer.setNationalId("12345678910");
		gamer.setBirthOfYear(1996);
		gamer.setMoney(150);
		
		campaing.setId(1);
		campaing.setName("Kampanya");
		campaing.setDiscount(50);
		
		gameManager.add(game);
		mernisAdapter.customerCheck(gamer);
		
		gamerManager.add(gamer);
		System.out.println("--------");
		saleManager.Sell(game, gamer);
		System.out.println("---------");
		saleManager.SellWithCampaing(game, gamer, campaing);
	}

	}


