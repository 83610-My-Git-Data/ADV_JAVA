package daos;

import java.sql.Connection;
import java.sql.SQLException;

import dbutil.DBUtil;

public class Dao implements AutoCloseable {
	protected Connection con;
	public Dao() throws Exception {
		con = DBUtil.getConnection();
	}
	public void close() {
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}