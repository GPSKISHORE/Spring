package com.service.store;

import com.bo.store.custBO;
import com.dao.store.IcustDao;
import com.dto.store.custDto;

public class custService implements IcustService {

	private IcustDao dao;
	
	public custService(IcustDao dao) {
		this.dao = dao;
	}
	
	@Override
	public String DataPreparation(custDto dto) throws Exception {

		String pin = String.valueOf(dto.getPINCODE());
		Double finalBill = 0.0; 
		
		byte dis = 0;
		if(pin.trim().startsWith("5"))
			dis = 50;
		else
		if(pin.trim().startsWith("1"))
			dis = 30;
		else
		if(pin.trim().startsWith("9"))
			dis = 70;
		else
			dis = 10;
		
		finalBill = dto.getBILL_AMT() - (dto.getBILL_AMT()/100)*dis;
		
		custBO bo = new custBO();
		bo.setMOB_NUM(dto.getMOB_NUM());
		bo.setC_NAME(dto.getC_NAME());
		bo.setPINCODE(dto.getPINCODE());
		bo.setBILL_AMT(dto.getBILL_AMT());
		bo.setDIS_PER(dis);
		bo.setFINAL_BILL(finalBill);
		
		return "Insert data count - "+dao.insertBillAmt(bo)+ " FINAL BILL AMOUNT IS "+finalBill;
	}

}
