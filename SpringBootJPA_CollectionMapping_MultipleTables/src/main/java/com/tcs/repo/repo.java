package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.enty.EntityMultipleTables;

public interface repo extends JpaRepository<EntityMultipleTables, Integer>{

}

