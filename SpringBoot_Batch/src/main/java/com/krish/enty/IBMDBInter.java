package com.krish.enty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBMDBInter extends JpaRepository<IBMEnty, Long>{

}
