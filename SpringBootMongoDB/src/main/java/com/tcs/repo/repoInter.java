package com.tcs.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tcs.enty.Entity;

public interface repoInter extends MongoRepository<Entity, String>{

}
