package com.instaweb.service;

import com.instaweb.entity.InstaUser;

public interface ServiceInterface {

	int createProfileService(InstaUser iu) throws Exception;

	boolean loginprofile(InstaUser iu);

}
