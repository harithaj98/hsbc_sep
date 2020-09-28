package com.facebookweb.utility;

import com.facebookweb.dao.DaoInterface;
import com.facebookweb.dao.FacebookDao;

public class DaoFactory {
	
	private DaoFactory() {
		
	}
	
	public static DaoInterface createObject(String st) {
		DaoInterface fd=null;
		
		if(st.equals("admin"))
			fd= new FacebookDao();
		
		return fd;
	}

}
