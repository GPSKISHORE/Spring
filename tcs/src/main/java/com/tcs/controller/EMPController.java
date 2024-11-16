package com.tcs.controller;

import com.tcs.dto.EMPdto;
import com.tcs.service.IEMPService;
import com.tcs.vo.EMPinfovo;

public class EMPController {

	private IEMPService es;

	public EMPController(IEMPService es) {
		this.es = es;
	}

	public String contolSetting(EMPinfovo vo) throws Exception {

		EMPdto dto = new EMPdto();
		dto.setENO(vo.getENO());
		dto.setENAME(vo.getENAME());
		dto.setDESCIGNATION(vo.getDESCIGNATION());

		return es.assignDTO(dto);
	}

}
