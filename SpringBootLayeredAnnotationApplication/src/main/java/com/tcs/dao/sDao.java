package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.tcs.emp.Employee;

@Profile({"uat"})
@Repository
public class sDao implements Idao{
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Integer> getData(Employee bo) throws Exception {
		
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM EMP");
		ResultSet rs = ps.executeQuery();
		
		List<Integer> li=new LinkedList<Integer>();
		while(rs.next()) {
			li.add(rs.getInt(1));
		}
		
		return li;
	}

}
