/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava.Users;

import net.fabcodejava.Customers.CustomerRepository;
import net.fabcodejava.Customers.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author HP Notebook
 */
public class CustomUserDetailsService implements UserDetailsService{
    
    @Autowired
	CustomerRepository repo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Customers user = repo.findByEmail(email);
		if(user==null) {
			throw new UsernameNotFoundException("User name not found");
		}
		return new CustomUserDetails(user);
	}
    
}
