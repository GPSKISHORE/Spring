package com.dto.store;

import java.io.Serializable;

public class custDto  implements Serializable {

	private Long MOB_NUM;
	private String C_NAME;
	private Integer PINCODE;
	private Double BILL_AMT;

	public Long getMOB_NUM() {
		return MOB_NUM;
	}

	public void setMOB_NUM(Long mOB_NUM) {
		MOB_NUM = mOB_NUM;
	}

	public String getC_NAME() {
		return C_NAME;
	}

	public void setC_NAME(String c_NAME) {
		C_NAME = c_NAME;
	}

	public Integer getPINCODE() {
		return PINCODE;
	}

	public void setPINCODE(Integer pINCODE) {
		PINCODE = pINCODE;
	}

	public Double getBILL_AMT() {
		return BILL_AMT;
	}

	public void setBILL_AMT(Double bILL_AMT) {
		BILL_AMT = bILL_AMT;
	}

}
