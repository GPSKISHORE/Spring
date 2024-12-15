package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.bo.EMPbo;

@Repository
public class EMPdao implements IEMPdao{

	@Autowired
	private DataSource ds;

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
