package com.tcs.enty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICust_Data extends JpaRepository<Cust_Entity_Model, Integer>{

	public <T extends RequiredCols1> List<T> findByCustNameNotLikeAndBillAmountBetweenOrderByCustName(String name,float tx,float tx1,Class<T> cl);

	//@Query("SELECT (billAmount) FROM Cust_Entity_Model WHERE custName =?1")
	@Query("FROM Cust_Entity_Model WHERE custName =:name")
	public Cust_Entity_Model gatherSal(String name);
	@Query("SELECT custName,billAmount FROM Cust_Entity_Model WHERE custName =:name")
	public Object gatherSelectedSal(String name);
}
