/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava.Users;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author HP Notebook
 */
public class PasswordEncoder {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
		String rawPassword = "lucy123";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);

	}
    
}
