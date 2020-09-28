package com.facebookweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.facebookweb.entity.FacebookUser;

public class FacebookDao implements DaoInterface {
	
	private Connection con;
	
	public FacebookDao() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","haritha","hari");
			
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int createProfileDao(FacebookUser fu) throws Exception{
		int i=0;
		
		PreparedStatement ps=con.prepareStatement("insert into FBUSER values(?,?,?,?)");
		ps.setString(1, fu.getName());
		ps.setString(2, fu.getPassword());
		ps.setString(3, fu.getEmail());
		ps.setString(4, fu.getAddress());
		
		i=ps.executeUpdate(); 
		
		return i;
		
		
		
	}

	@Override
	public boolean loginprofiledao(FacebookUser fu) {
		
		boolean i=false;
		
		try {
			PreparedStatement ps;
			ps = con.prepareStatement("select * from FBUSER where NAME=? and PWD=?");
		
		ps.setString(1, fu.getName());
		ps.setString(2, fu.getPassword());
		
		ResultSet res= ps.executeQuery();
		
		if(res.next())
			i=true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

}
