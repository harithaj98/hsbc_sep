package com.instaweb.dao;

import com.instaweb.entity.InstaUser;

public interface DaoInterface {

	int createProfileDao(InstaUser iu) throws Exception;

	boolean loginprofileDao(InstaUser iu);

}
