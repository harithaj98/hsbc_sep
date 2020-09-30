package com.ajax.utility;

import com.ajax.service.ServiceInterface;
import com.ajax.service.cityService;

public class ServiceFactory {
	
	private ServiceFactory() {
		
	}

	
	public static ServiceInterface createObject(String st) {
		
		ServiceInterface cs =null;
		
		if(st.equals("admin")) {
			cs= new cityService();
		}
		return cs;
	}
}
