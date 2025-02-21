package com.tcs.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDB {

	@Autowired
	private DataSource ds;
	
	public LinkedList<String> dbData() throws SQLException {
		LinkedList<String> li = new LinkedList<String>();
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM EMP");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
			li.add(rs.getString(2));

		return li;
	}
}
