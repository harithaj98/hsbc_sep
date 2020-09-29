package com.ajax.utility;

import com.ajax.dao.DaoInterface;
import com.ajax.dao.cityDao;
import com.ajax.service.ServiceInterface;
import com.ajax.service.cityService;

public class DaoFactory {

private DaoFactory() {
		
	}

	
	public static DaoInterface createObject(String st) {
		
		DaoInterface cd =null;
		
		if(st.equals("admin")) {
			cd= new cityDao();
		}
		return cd;
	}
	
}
