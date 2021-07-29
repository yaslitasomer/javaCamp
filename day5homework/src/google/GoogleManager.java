package google;

import core.GoogleService;

public class GoogleManager implements GoogleService{

  @Override
  public void sendVerificationEmail(String email) {
    System.out.println(email + " e-posta adresine doğrulama e-mail'i gönderildi!");

  }

  @Override
  public boolean verifyAccount(String email) {
    System.out.println(email + " e-posta adresidoğrulandı!");
    return true;
  }

}
