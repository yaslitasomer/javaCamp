package business.abstracts;
import entities.User;

public interface IUserService {

  void add(User user);
  void update(User user);
  void delete(User user);
}
