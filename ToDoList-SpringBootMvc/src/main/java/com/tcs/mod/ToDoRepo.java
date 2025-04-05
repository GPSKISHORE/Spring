package com.tcs.mod;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<ToDoModel, Integer>{

}
