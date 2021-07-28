package business.abstracts;
import entities.Campaign;
import entities.Game;
import entities.User;

public interface IGameSaleService {

  void sell(Game game, User user, Campaign campaign);
}
