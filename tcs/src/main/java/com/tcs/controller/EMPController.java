package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tcs.dto.EMPdto;
import com.tcs.service.IEMPService;
import com.tcs.vo.EMPinfovo;

@Controller("ctr")
public class EMPController {

	@Autowired
	private IEMPService es;

	public String contolSetting(EMPinfovo vo) throws Exception {

		EMPdto dto = new EMPdto();
		dto.setENO(vo.getENO());
		dto.setENAME(vo.getENAME());
		dto.setDESCIGNATION(vo.getDESCIGNATION());

		return es.assignDTO(dto);
	}

}
