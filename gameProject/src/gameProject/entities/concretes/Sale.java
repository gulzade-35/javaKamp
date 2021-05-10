package gameProject.entities.concretes;

import gameProject.entities.abstracts.Entity;

public class Sale implements Entity {
	private int id;
	private int gameId;
	private int gamerId;
	
	public Sale() {
		
	}

	public Sale(int id, int gameId, int gamerId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.gamerId = gamerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
}
