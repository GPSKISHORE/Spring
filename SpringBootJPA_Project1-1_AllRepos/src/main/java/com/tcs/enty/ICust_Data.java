package com.tcs.enty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICust_Data extends JpaRepository<Cust_Entity_Model, Integer>{

	public List<Cust_Entity_Model> findBycustNameLikeIgnoreCase(String name);
}
