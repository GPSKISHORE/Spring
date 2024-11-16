package com.tcs.service;

import com.tcs.bo.EMPbo;
import com.tcs.dao.IEMPdao;
import com.tcs.dto.EMPdto;

public class EMPService implements IEMPService{

	private static Float Netsal;
	private static Float Gross;
	private IEMPdao dao;
	
	public EMPService(IEMPdao dao) {
		this.dao = dao;
	}
	
	public String assignDTO(EMPdto dto) throws Exception {
		
		String des = dto.getDESCIGNATION();
		Float basicsal = 0.0f;
		
		if(des.equalsIgnoreCase("Engineer"))
			basicsal = 15500.23f;
		else
		if(des.equalsIgnoreCase("Devloper"))
			basicsal = 17230.45f;
		else
		if(des.equalsIgnoreCase("SeniorDev"))
			basicsal = 25650.65f;
		else
		if(des.equalsIgnoreCase("Manager"))
				basicsal = 44325.65f;
		else
			basicsal = 45325.56f;
		
		Netsal = basicsal + ((basicsal/10)*2);
		Gross =  Netsal + 1500;
		
		EMPbo bo = new EMPbo();
		bo.setENO(Integer.parseInt(dto.getENO()));
		bo.setENAME(dto.getENAME());
		bo.setDESCIGNATION(dto.getDESCIGNATION());
		bo.setBASICSAL(basicsal);
		bo.setNETSAL(Netsal);
		bo.setGROSSSAL(Gross);	

		System.out.println(Netsal);
		System.out.println(Gross);
		
		return "EMP updated count "+dao.resultdao(bo) + ", ENO: "+bo.getENO()+", Ename: "+
		bo.getENAME()+", Basicsal "+bo.getBASICSAL()+", Grosssal "+bo.getGROSSSAL()+", NetSAl: "+Netsal;
	}

}
