package com.tcs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tcs.enty.EmpEnty;

public interface EmpRepo extends JpaRepository<EmpEnty, Integer>{

	@Query("from EmpEnty WHERE eName IN (:N1,:N2)")
	public List<EmpEnty> getEmp(@Param("N1") String emp1,@Param("N2") String emp2);
}
