package controllers.abstracts;
import entities.User;

public interface IUserValidationService {

  boolean validate(User user);
}
