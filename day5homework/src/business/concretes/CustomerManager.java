package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import business.abstracts.MailVerificationService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{

  CustomerCheckService customerCheckService;
  MailVerificationService mailVerificationService;
  CustomerDao customerDao;


  public CustomerManager(CustomerCheckService customerCheckService, MailVerificationService mailVerificationService,
      CustomerDao customerDao) {
    this.customerCheckService = customerCheckService;
    this.mailVerificationService = mailVerificationService;
    this.customerDao = customerDao;
  }

  @Override
  public void signUp(Customer customer) {

    if (customerCheckService.isValid(customer)){
      System.out.println(customer.getFirstName() + " kullanıcısı sisteme eklendi!");
      mailVerificationService.sendMail(customer.getEmail());
      customerDao.add(customer);
    }

  }

  @Override
  public void signIn(Customer customer) {
    mailVerificationService.verifyMail(customer.getEmail());

    if (customerDao.getEmail(customer.getEmail()) && customerDao.getPassword(customer.getPassword()) &&
    mailVerificationService.isVerificated(customer.getEmail())){
      System.out.println("Kullanıcı girişi başarıyla yapıldı!");
    }
    else{
      System.out.println("Kullanıcı girişi yapılamadı!");
    }

  }

}
