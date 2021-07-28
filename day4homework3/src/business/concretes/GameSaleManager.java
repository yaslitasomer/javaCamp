package business.concretes;
import business.abstracts.ICampaignService;
import business.abstracts.IGameSaleService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class GameSaleManager implements IGameSaleService {

  private ICampaignService campaignService;


  public GameSaleManager(ICampaignService campaignService) {
    this.campaignService = campaignService;
  }


  @Override
  public void sell(Game game, User user, Campaign campaign) {

    double price = game.getGamePrice() - (game.getGamePrice() * campaign.getDiscountRate() / 100);

    System.out.println(user.getFirstName() + " " + user.getLastName() + " oyuncusuna " + game.getGamePrice() + " değerindeki " + game.getGameName()
    + " adlı oyun " + price + " indirimli fiyatıyla satıldı!");
  }

}
