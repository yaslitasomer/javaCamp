package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

  List<String> listOfEmail = new ArrayList<String>();

  @Override
  public boolean checkFirstName(Customer customer) {
    if (customer.getFirstName().length() < 3){
      System.out.println("İsim alanı 3 karakterden küçük olamaz!");
      return false;
    }
    else
      return true;
  }

  @Override
  public boolean checkLastName(Customer customer) {
    if (customer.getLastName().length() < 3){
      System.out.println("İsim alanı 3 karakterden küçük olamaz!");
      return false;
    }
    else
      return true;
  }

  @Override
  public boolean checkEmail(Customer customer) {
    String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    if (!pattern.matcher(customer.getEmail()).find()){
      System.out.println("Girilen adres format dışıdır!");
      return false;
    }
    else{
      return true;
    }
  }

  @Override
  public boolean checkPassword(Customer customer) {
    if (customer.getPassword().length() < 6){
      System.out.println("Parola alanı 6 karakterden küçük olamaz!");
      return false;
    }
    else
      return true;
  }

  @Override
  public boolean uniqueEmail(Customer customer) {
    if (listOfEmail.contains(customer.getEmail())){
      System.out.println("Bu email ile daha önce kayıt olunmuştur!");
      return false;
    }
    else{
      listOfEmail.add(customer.getEmail());
      return true;
    }
  }

  @Override
  public boolean isValid(Customer customer) {
    if (checkFirstName(customer) && checkLastName(customer) && checkPassword(customer) && checkEmail(customer)
    && uniqueEmail(customer)){
      return true;
    }
    else{
      return false;
    }
  }
}
