package com.bo.store;

public class custBO {

	private Long MOB_NUM;
	private String C_NAME;
	private Integer PINCODE;
	private Double BILL_AMT;
	private Byte DIS_PER;
	private Double FINAL_BILL;

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

	public Byte getDIS_PER() {
		return DIS_PER;
	}

	public void setDIS_PER(Byte dIS_PER) {
		DIS_PER = dIS_PER;
	}

	public Double getFINAL_BILL() {
		return FINAL_BILL;
	}

	public void setFINAL_BILL(Double fINAL_BILL) {
		FINAL_BILL = fINAL_BILL;
	}

}
