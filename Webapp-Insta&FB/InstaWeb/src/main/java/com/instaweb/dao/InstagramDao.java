package com.instaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.instaweb.entity.InstaUser;

public class InstagramDao implements DaoInterface {

	private Connection con;
	
	public InstagramDao() {
		
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","haritha","hari");
			
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int createProfileDao(InstaUser iu) throws Exception {
		
		
		int i=0;
		PreparedStatement ps=con.prepareStatement("insert into INSTAUSER values(?,?,?,?)");
		ps.setString(1, iu.getName());
		ps.setString(2, iu.getPassword());
		ps.setString(3, iu.getEmail());
		ps.setString(4, iu.getAddress());
		
		i=ps.executeUpdate(); 
		
	
	
		return i;
		
		
	}

	@Override
	public boolean loginprofileDao(InstaUser iu) {
		boolean i=false;
		
		try {
			PreparedStatement ps;
			ps = con.prepareStatement("select * from INSTAUSER where NAME=? and PWD=?");
		
		ps.setString(1, iu.getName());
		ps.setString(2, iu.getPassword());
		
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
