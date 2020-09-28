package com.instaweb.service;

import com.instaweb.dao.DaoInterface;
import com.instaweb.entity.InstaUser;
import com.instaweb.utility.DaoFactory;

public class InstagramService implements ServiceInterface {
	
	
	DaoInterface id=null;
	
	public InstagramService(){
		
		id= DaoFactory.createObject("admin");
	}

	@Override
	public int createProfileService(InstaUser iu) throws Exception{
		int i;
		
		i= id.createProfileDao(iu);
		return i;
	}

	@Override
	public boolean loginprofile(InstaUser iu) {
		
		boolean i=false;
		i=id.loginprofileDao(iu);
		return i;
	}

}
