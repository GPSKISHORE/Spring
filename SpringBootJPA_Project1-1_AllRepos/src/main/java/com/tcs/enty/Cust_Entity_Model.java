package com.tcs.enty;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GSR_Cust_Data")
public class Cust_Entity_Model {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(name = "CUST_SEQ", sequenceName = "CUST_SEQ",allocationSize = 1)
	private Integer Cust_Id;
	
	@NonNull
	private Long Cust_Mob_Number;
	@Column(name = "Cust_Name")
	private String custName;
	@NonNull
	private Float Bill_Amount;
	@NonNull
	@Column(name = "Trx_Type")
	private String trxType;
	@NonNull
	private String Trx_Refe_Num;
	
	private Timestamp Last_Visit_Date;
}
