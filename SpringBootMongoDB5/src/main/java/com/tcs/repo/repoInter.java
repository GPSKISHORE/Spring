package com.tcs.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.tcs.enty.Entity;

public interface repoInter extends MongoRepository<Entity, String>{

	@Query(value = "{visitedEarth : ?0 , Gold:?1,Amount:{$gte:?2}}")
	public List<Entity> getAllRecods(Boolean name,String par,int amo);
	
	@Query(fields = "{sno:0,name:1,House:1}", value = "{$or:[{name:?0}, {name:?1}]}")
	public List<Entity> getRecordsBasedonOrCon(String name,String name2);
}
