/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava.Customers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP Notebook
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long>{
    
    @Query("SELECT u FROM Customers u WHERE u.email=?1")

	Customers findByEmail(String email);

    public Customers save(Customers user);


    
    
}
