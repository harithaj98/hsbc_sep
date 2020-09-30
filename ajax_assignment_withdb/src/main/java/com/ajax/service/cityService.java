package com.ajax.service;

import java.util.ArrayList;

import com.ajax.dao.DaoInterface;
import com.ajax.utility.DaoFactory;

public class cityService implements ServiceInterface {
	
	DaoInterface cd=null;
	
	public cityService() {
		
		cd= DaoFactory.createObject("admin");
	}
	
	
	@Override
	public ArrayList<String> getCity(String n) {
		ArrayList<String> ret= cd.getCityDao(n);
		
		return ret;
	}
	
	public ArrayList<String> getCountry(){
		
		ArrayList<String> ret= cd.getCountryDao();
		
		return ret;
		
		
	}
	
public ArrayList<String> getState(String n){
		
	ArrayList<String> ret= cd.getStateDao(n);
	
	return ret;
		
		
	}
}
