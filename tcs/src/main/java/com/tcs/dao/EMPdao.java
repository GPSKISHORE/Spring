package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.tcs.bo.EMPbo;

public class EMPdao implements IEMPdao{

	private DataSource ds;
	
	public EMPdao(DataSource ds) {
		this.ds=ds;
	}
	
	@Override
	public int resultdao(EMPbo bo) throws Exception{
		
		Connection con = ds.getConnection();
		PreparedStatement ps= con.prepareStatement("INSERT INTO EMPLOYEESPRING VALUES (?,?,?,?,?,?)");
		
		ps.setInt(1, bo.getENO());
		ps.setString(2, bo.getENAME());
		ps.setString(3, bo.getDESCIGNATION());
		ps.setFloat(4, bo.getBASICSAL());
		ps.setFloat(6, bo.getNETSAL());
		ps.setFloat(5, bo.getGROSSSAL());
		
		int i = ps.executeUpdate();
		
		return i;
	}

}
