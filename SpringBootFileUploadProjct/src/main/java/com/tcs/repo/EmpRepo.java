package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tcs.entity.Enty;

public interface EmpRepo extends JpaRepository<Enty, Integer>{

	@Query("SELECT resume FROM Enty WHERE id =:nm")
	public String getResumeFileName(Integer nm);
	
	@Query("SELECT img FROM Enty WHERE id =:nm")
	public String getProfileName(Integer nm);
}
