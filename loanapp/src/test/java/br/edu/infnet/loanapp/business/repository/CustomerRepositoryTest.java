package br.edu.infnet.loanapp.business.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.infnet.loanapp.ServletInitializerApplication;
import br.edu.infnet.loanapp.business.model.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServletInitializerApplication.class)
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testOk() {
		assertTrue(true);
	}

	@Test
	public void goingToDataBaseTest() {
		final Customer customer = new Customer();
		customer.setAddress("Lal lala Lala");
		customer.setName("Dias sa");

		this.customerRepository.save(customer);

		assertTrue(!this.customerRepository.findAll().isEmpty());
	}

}
