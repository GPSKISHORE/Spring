package com.dao.store;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.bo.store.custBO;

public class custDao implements IcustDao {

	private DataSource ds;

	public custDao(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertBillAmt(custBO bo) throws Exception {
		int resulet;

		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement("INSERT INTO BILL_DISCOUNT VALUES (?,?,?,?,?,?)")) {

			ps.setLong(1, bo.getMOB_NUM());
			ps.setString(2, bo.getC_NAME());
			ps.setInt(3, bo.getPINCODE());
			ps.setDouble(4, bo.getBILL_AMT());
			ps.setByte(5, bo.getDIS_PER());
			ps.setDouble(6, bo.getFINAL_BILL());

			resulet = ps.executeUpdate();

		} catch (Exception e) {
			throw (e);
		}
		return resulet;

	}

}
