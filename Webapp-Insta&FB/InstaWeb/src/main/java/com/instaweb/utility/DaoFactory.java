package com.instaweb.utility;

import com.instaweb.dao.DaoInterface;
import com.instaweb.dao.InstagramDao;
import com.instaweb.service.InstagramService;
import com.instaweb.service.ServiceInterface;

public class DaoFactory {

	private DaoFactory() {
		
	}
	
	
	
	
	
public static DaoInterface createObject(String str) {
		
		DaoInterface id=null;
		
		if(str.equals("admin"))
			id=new InstagramDao();
		
		
		
		return id;
	}
}
