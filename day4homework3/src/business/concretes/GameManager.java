package business.concretes;
import business.abstracts.IGameService;
import entities.Game;

public class GameManager implements IGameService{

  @Override
  public void add(Game game) {
    System.out.println(game.getGameName() + " oyunu sisteme eklendi!");

  }

  @Override
  public void update(Game game) {
    System.out.println(game.getGameName() + " oyunu güncellendi!");

  }

  @Override
  public void delete(Game game) {
    System.out.println(game.getGameName() + " oyunu sistemden silindi!");
  }

}
