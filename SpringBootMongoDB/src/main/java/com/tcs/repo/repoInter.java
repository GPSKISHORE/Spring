package com.tcs.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tcs.enty.Entity;

public interface repoInter extends MongoRepository<Entity, String>{

	public List<Entity> findByName(String nm);
	public List<Entity> findByrankOrderByNameAsc(int r);
}
