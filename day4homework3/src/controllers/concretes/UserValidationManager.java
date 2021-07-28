package controllers.concretes;
import controllers.abstracts.IUserValidationService;
import entities.User;

public class UserValidationManager implements IUserValidationService {

  @Override
  public boolean validate(User user) {

    if( user.getFirstName() == "Ömer" && user.getLastName() == "Yaslıtaş" && user.getDateOfBirth() == 2001 && user.getNationalityId() == "11111")
      return true;
    else
      return false;
  }
}
