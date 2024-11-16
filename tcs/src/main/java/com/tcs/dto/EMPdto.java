package com.tcs.dto;

import java.io.Serializable;

public class EMPdto implements Serializable {

	private String ENO;
	private String ENAME;
	private String DESCIGNATION;

	public String getENO() {
		return ENO;
	}

	public void setENO(String eNO) {
		ENO = eNO;
	}

	public String getENAME() {
		return ENAME;
	}

	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	public String getDESCIGNATION() {
		return DESCIGNATION;
	}

	public void setDESCIGNATION(String dESCIGNATION) {
		DESCIGNATION = dESCIGNATION;
	}
}
