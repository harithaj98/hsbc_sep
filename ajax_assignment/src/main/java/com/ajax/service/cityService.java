package com.ajax.service;

import com.ajax.dao.DaoInterface;
import com.ajax.utility.DaoFactory;

public class cityService implements ServiceInterface {
	
	DaoInterface cd=null;
	
	public cityService() {
		
		cd= DaoFactory.createObject("admin");
	}
	
	
	@Override
	public StringBuilder getCity(String n) {
		StringBuilder ret= cd.getCityDao(n);
		
		return ret;
	}

}
