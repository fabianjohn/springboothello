package net.fabcodejava.repositor;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.fabcodejava.Entity.Job;
@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
	
	@Query("SELECT u FROM Job u WHERE u.jobTitle=?1")

	List<Job> findByJobTitle(String jobTitle);

	List<Job> findById(int id);

	Optional<Job> findById(Long id);

}
