package com.instaweb.utility;

import com.instaweb.service.InstagramService;
import com.instaweb.service.ServiceInterface;

public class ServiceFactory {
	
	private ServiceFactory() {
		
	}

	public static ServiceInterface createObject(String str) {
		
		ServiceInterface is=null;
		
		if(str.equals("admin"))
			is=new InstagramService();
		
		
		
		return is;
	}

}
