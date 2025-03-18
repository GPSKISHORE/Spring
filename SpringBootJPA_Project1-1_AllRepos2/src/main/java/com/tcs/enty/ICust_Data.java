package com.tcs.enty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;

public interface ICust_Data extends JpaRepository<Cust_Entity_Model, Integer>{

	public <T extends RequiredCols1> List<T> findByCustNameNotLikeAndBillAmountBetweenOrderByCustName(String name,float tx,float tx1,Class<T> cl);

	//@Query("SELECT (billAmount) FROM Cust_Entity_Model WHERE custName =?1")
	@Query("FROM Cust_Entity_Model WHERE custName =:name")
	public Cust_Entity_Model gatherSal(String name);
	@Query("SELECT custName,billAmount FROM Cust_Entity_Model WHERE custName =:name")
	public Object gatherSelectedSal(String name);
	@Query("UPDATE Cust_Entity_Model SET billAmount=?1 where custName = ?2")
	@Modifying
	@Transactional
	public int modifyData(float billAmount,String custName);
	
	@Query(value = "INSERT INTO GSR_Cust_Data (Cust_Id,Bill_Amount,Cust_Name,Trx_Type,Trx_Refe_Num) VALUES (CUST_SEQ.NEXTVAL,?,?,?,?)",nativeQuery = true)
	@Modifying
	@Transactional
	public int insertData(float billAmount,String custName,String trxType,String trxRefeNum);
}
