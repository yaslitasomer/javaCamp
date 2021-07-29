package core;

public interface GoogleService {
  void sendVerificationEmail(String email);
  boolean verifyAccount(String email);
}
