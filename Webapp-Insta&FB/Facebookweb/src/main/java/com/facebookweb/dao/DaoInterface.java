package com.facebookweb.dao;

import com.facebookweb.entity.FacebookUser;

public interface DaoInterface {

	int createProfileDao(FacebookUser fu) throws Exception;

	boolean loginprofiledao(FacebookUser fu);

}
