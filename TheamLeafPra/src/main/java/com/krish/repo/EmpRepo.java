package com.krish.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krish.enty.EmpEnty;

public interface EmpRepo extends JpaRepository<EmpEnty, Integer>{

}
