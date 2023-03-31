/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.fabcodejava.Customers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author HP Notebook
 */
@Service
public class CustomerServices {
	
	
    
    @Autowired
    CustomerRepository repo;
    
    public List<Customers>listAll(){
    
        return repo.findAll();
    }
    public void save(Customers user){
    repo.save(user);
    }
    
    public Customers get(Long id){
    return repo.findById(id).get();
    }
    public void delete(Long id){
    repo.deleteById(id);
    }
    public Customers findById(Long id){
    return repo.findById(id).get();
    }

    List<Customers> findALL() {
        return repo.findAll(); //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
