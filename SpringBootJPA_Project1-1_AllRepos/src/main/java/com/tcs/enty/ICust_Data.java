package com.tcs.enty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICust_Data extends JpaRepository<Cust_Entity_Model, Integer>{

	public <T extends RequiredCols1> List<T> findByCustNameNotLikeAndBillAmountBetweenOrderByCustName(String name,float tx,float tx1,Class<T> cl);
}
