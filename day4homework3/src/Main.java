import business.concretes.CampaignManager;
import business.concretes.GameSaleManager;
import business.concretes.UserManager;
import controllers.concretes.UserValidationManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {
  public static void main(String[] args) {

    User user = new User(1, "Ömer", "Yaslıtaş", 2001, "11111");
    Campaign campaign = new Campaign(1, "Summer Sale", 50);
    Game game = new Game(1, "Genshin Impact", 200);

    UserManager userManager = new UserManager(new UserValidationManager());
    userManager.add(user);

    System.out.println("\n***********\n");

    CampaignManager campaignManager = new CampaignManager();
    campaignManager.add(campaign);

    System.out.println("\n***********\n");

    GameSaleManager gameSaleManager = new GameSaleManager(new CampaignManager());
    gameSaleManager.sell(game, user, campaign);





  }
}
