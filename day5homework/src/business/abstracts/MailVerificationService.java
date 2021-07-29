package business.abstracts;

public interface MailVerificationService {
  void sendMail(String email);
  void verifyMail(String email);
  boolean isVerificated(String email);
}
