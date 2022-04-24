/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava;


import net.fabcodejava.Customers.CustomerRepository;
import net.fabcodejava.Customers.Customers;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author HP Notebook
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class CustomerRepositoryTest {
    
   
    
    @Autowired
	private CustomerRepository repo;
	

	@Autowired
	private TestEntityManager entityManager;
	
	/*
	@Test
	public void testCreateCustomer() {
		
		Customers user = new Customers();
		user.setFullName("Fabian J I");
		user.setEmail("fabj@gmail.com");
		user.setPhoneNo("08148360");
		user.setPassword("john123");
		
		Customers savedCustomers = repo.save(user);
		Customers existCustomers = entityManager.find(Customers.class, savedCustomers.getId());
		
		assertThat(existCustomers.getEmail()).isEqualTo(user.getEmail());
	}
        */
	
	//new project rest
        /*
	@Test
	public void testFindUserByEmail() {
		String email = "cov@gmail.com";
		
		Customers user = repo.findByEmail(email);
		assertThat(user).isNotNull();
		
	}
        */
	
	
}
