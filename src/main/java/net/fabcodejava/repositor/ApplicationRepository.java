package net.fabcodejava.repositor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.fabcodejava.Entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
	
	@Query("SELECT u FROM Application u WHERE u.name=?1")
	
	Application findByName(String name);

	List<Application> findAll();

}
