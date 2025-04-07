package com.tcs.control;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.enty.EmpEnty;

public interface EmpRepo extends JpaRepository<EmpEnty, Integer>{

}
