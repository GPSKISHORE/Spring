package com.controller.store;

import com.dto.store.custDto;
import com.service.store.IcustService;
import com.vo.store.custVO;

public class custController {

	private IcustService cs;

	public custController(IcustService cs) {
		this.cs = cs;
	}

	public String DataGetting(custVO vo) throws Exception {

		custDto dto = new custDto();
		dto.setMOB_NUM(Long.parseLong(vo.getMOB_NUM()));
		dto.setC_NAME(vo.getC_NAME());
		dto.setPINCODE(Integer.parseInt(vo.getPINCODE()));
		dto.setBILL_AMT(Double.parseDouble(vo.getBILL_AMT()));

		return cs.DataPreparation(dto);

	}
}
