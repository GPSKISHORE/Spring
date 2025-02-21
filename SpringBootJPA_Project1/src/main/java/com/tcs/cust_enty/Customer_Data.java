package com.tcs.cust_enty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Cust_Data")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer_Data {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer CUST_ID;
	@NonNull
	private String CUST_NAME;
	@NonNull
	private Float BILL_AMOUNT;
	@Column(name = "MOBILE_NUMBER", length = 10)
	@NonNull
	private String MOBILE_NUMBER;
	
}
