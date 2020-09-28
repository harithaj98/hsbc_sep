package com.facebookweb.utility;

import com.facebookweb.service.FacebookService;
import com.facebookweb.service.ServiceInterface;

public class ServiceFactory {

	private ServiceFactory() {
		
	}
	
	public static ServiceInterface createObject(String st) {
		ServiceInterface fs=null;
		
		if(st.equals("admin"))
			fs= new FacebookService();
		
		return fs;
	}
	
	
}
