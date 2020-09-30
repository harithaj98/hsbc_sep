package com.ajax.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class cityDao implements DaoInterface {
	
	private ArrayList<String> list=null;
	private Connection con;
	
	public cityDao() {
		
		list= new ArrayList<>();
		/*list.add("Argentina");
		list.add("Armenia");
		list.add("Arizona");
		list.add("Bangladesh");
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Chattisgarh");
		*/
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con=DriverManager.getConnection("jdbc:derby:c:/firstdb1;create=true","haritha","hari");
			list= new ArrayList<>();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public ArrayList<String> getCityDao(String n) {
		
		try {
		PreparedStatement ps=con.prepareStatement("Select SID from state where state=?");
		ps.setString(1, n);
		
		ResultSet i= ps.executeQuery();
		i.next();
		PreparedStatement ps1=con.prepareStatement("Select CITY from city where SID=?");
		ps1.setString(1, i.getString(1));
		
		ResultSet j= ps1.executeQuery();
		
		
		while (j.next() ) {
			list.add(j.getString(1));	
			}
	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<String> getStateDao(String n) {
		
		
		try {
		PreparedStatement ps=con.prepareStatement("Select CID from country where country=?");
		ps.setString(1, n);
		
		ResultSet i= ps.executeQuery();
		i.next();
		PreparedStatement ps1=con.prepareStatement("Select STATE from STATE where CID=?");
		ps1.setString(1, i.getString(1));
		
		ResultSet j= ps1.executeQuery();
		
		
		while (j.next() ) {
			list.add(j.getString(1));
			}
	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
		
		
	}

	@Override
	public ArrayList<String> getCountryDao() {
		
		
		try {
		PreparedStatement ps=con.prepareStatement("select * from country");
		
		
		ResultSet i= ps.executeQuery();
		
		
		while (i.next() ) {
			list.add(i.getString(2));
			}
	
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	

}
