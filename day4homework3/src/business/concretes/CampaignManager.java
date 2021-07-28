package business.concretes;
import business.abstracts.ICampaignService;
import entities.Campaign;

public class CampaignManager implements ICampaignService {

  @Override
  public void add(Campaign campaign) {
    System.out.println("Kampanya eklendi: " + campaign.getCampaignName());

  }

  @Override
  public void update(Campaign campaign) {
    System.out.println("Kampanya güncellendi: " + campaign.getCampaignName());

  }

  @Override
  public void delete(Campaign campaign) {
    System.out.println("Kampanya silindi: " + campaign.getCampaignName());
  }

}
