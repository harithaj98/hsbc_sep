package com.facebookweb.service;

import com.facebookweb.entity.FacebookUser;

public interface ServiceInterface {

	

	int createProfileService(FacebookUser fu) throws Exception;

	boolean loginprofile(FacebookUser fu);

}
