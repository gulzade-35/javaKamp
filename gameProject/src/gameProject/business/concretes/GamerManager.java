package gameProject.business.concretes;

import gameProject.business.abstracts.GamerService;
import gameProject.entities.concretes.Gamer;

public class GamerManager extends BaseCrudManager<Gamer> implements GamerService {

	@Override
	public Gamer getByGameId() {
		return null;
	}

}
