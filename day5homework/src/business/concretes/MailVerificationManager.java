package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.MailVerificationService;

public class MailVerificationManager implements MailVerificationService {

  List<String> verificatedMails = new ArrayList<String>();

  @Override
  public void sendMail(String email) {
    System.out.println(email + " adresine doğrulama mail'i gönderildi!");
  }

  @Override
  public void verifyMail(String email) {
    verificatedMails.add(email);

  }

  @Override
  public boolean isVerificated(String email) {
    if (verificatedMails.contains(email)){
      return true;
    }
    else
      return false;
  }

}
