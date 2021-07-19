package concretes;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import adapters.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		_customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person!");
		}
	}
}
