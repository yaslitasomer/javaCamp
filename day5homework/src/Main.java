import business.concretes.CustomerCheckManager;
import business.concretes.CustomerManager;
import business.concretes.MailVerificationManager;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class Main {
  public static void main(String[] args) {

    Customer customer1 = new Customer(1, "Garland", "Mueller", "garland47@gmail.com", "123456");
    Customer customer2 = new Customer(1, "Mozell", "Rempel", "rempel1024@gmail.com", "123458");

    CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(), new MailVerificationManager(), new HibernateCustomerDao());

    customerManager.signIn(customer1);
    customerManager.signUp(customer2);
    customerManager.signIn(customer2);
  }
}
