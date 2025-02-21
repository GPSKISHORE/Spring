package com.tcs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.tcs.BO.BOClass;
import com.tcs.emp.Employee;

@Repository
@Profile({"dev","test"})
public class DAO implements Idao{

	@Autowired
	private DataSource ds;
	
	public List<Integer> getData(Employee bo) throws SQLException {

		Connection con = ds.getConnection();
		//PreparedStatement ps = con.prepareStatement("SELECT * FROM EMP WHERE ENAME = ?");
		PreparedStatement ps = con.prepareStatement("INSERT INTO EMP VALUES (?,?,?,?)");
		ps.setInt(1, Integer.parseInt(bo.getEMP_Num()));
		ps.setString(2,bo.getEMP_NM());
		ps.setString(4, bo.getDesignation());
		ps.setInt(3,Integer.parseInt(bo.getSal()));
		
		int rs = ps.executeUpdate();
		List<Integer> li = new LinkedList<Integer>();
		
		li.add(rs);
		return li;
	}
}
