package com.facebookweb.service;

import com.facebookweb.dao.DaoInterface;
import com.facebookweb.entity.FacebookUser;
import com.facebookweb.utility.DaoFactory;

public class FacebookService implements ServiceInterface {
	
	DaoInterface fd=null;
	
	public FacebookService() {
		
		fd= DaoFactory.createObject("admin");
	}
	
	@Override
	public int createProfileService(FacebookUser fu) throws Exception {
		
		int i=0;
		i= fd.createProfileDao(fu);
		return i;
	}

	@Override
	public boolean loginprofile(FacebookUser fu) {
		boolean i;
		
		i=fd.loginprofiledao(fu);
		return i;
	}

}
