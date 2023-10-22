package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements AutoCloseable {
	private Connection con;

	public UserDAO() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public java.sql.Date parseDate(String dob) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date date = sdf.parse(dob);
			java.sql.Date sqldate = new java.sql.Date(date.getTime());
			return sqldate;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int addUser(int id, String firstName, String lastName, String email, String password, String dob,
			boolean status, String role) throws SQLException {
		String sql = "INSERT into users values(?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.setString(2, firstName);
		stmt.setString(3, lastName);
		stmt.setString(4, email);
		stmt.setString(5, password);
		stmt.setDate(6, parseDate(dob));
		stmt.setBoolean(7, status);
		stmt.setString(8, role);
		int cnt = stmt.executeUpdate();
		return cnt;
	}
	
	public int deleteUser(int id) throws SQLException
	{
		String sql = "DELETE from users where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		int cnt = stmt.executeUpdate();
		return cnt;
	}
	
	public int updateEmail(int id, String password) throws SQLException
	{
		String sql = "Update users set password = ? where id = ?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, password);
		stmt.setInt(2, id);
		int cnt = stmt.executeUpdate();
		return cnt;
	}
	
	public List<User> showUser() throws SQLException
	{
		List<User> list = new ArrayList<>();
		String sql = "Select * from users";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet set = stmt.executeQuery();
		while(set.next())
		{
			int id = set.getInt("id");
			String firstName = set.getString("first_name");
			String lastName = set.getString("last_name");
			String email = set.getString("email");
			java.sql.Date sDob = set.getDate("dob");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String strDob = sdf.format(sDob);
			Boolean status = set.getBoolean("status");
			String role = set.getString("role");
			User user = new User(id, firstName, lastName, email, strDob,status,role);
			list.add(user);
		}
		
		return list;
		
	}
	
	

}
