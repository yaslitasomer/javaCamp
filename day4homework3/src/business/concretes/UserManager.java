package business.concretes;
import business.abstracts.IUserService;
import controllers.abstracts.IUserValidationService;
import entities.User;

public class UserManager implements IUserService {

  private IUserValidationService iUserValidationService;

  public UserManager(IUserValidationService iUserValidationService) {
    this.iUserValidationService = iUserValidationService;
  }

  @Override
  public void add(User user) {
    if (iUserValidationService.validate(user))
      System.out.println("Oyuncu doğrulandı. Sisteme kaydedildi : " + user.getFirstName() + " " + user.getLastName());
    else
      System.out.println("Oyuncu doğrulanamadı. Kayıt başarısız.");
  }

  @Override
  public void delete(User user) {
    if (iUserValidationService.validate(user))
      System.out.println("Oyuncu doğrulandı. Güncellendi : " + user.getFirstName() + " " + user.getLastName());

  }

  @Override
  public void update(User user) {
    if (iUserValidationService.validate(user))
      System.out.println("Oyuncu doğrulandı. Sistemden silindi : " + user.getFirstName() + " " + user.getLastName());
  }

}
