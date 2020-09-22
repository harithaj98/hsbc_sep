package com.instagram.utility;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;

public class DaoFactory {
	
	private DaoFactory(){
		
	}
	
	public static InstagramDAOInterface createObject(String nn) {
		
		InstagramDAOInterface is= null;
		
		if(nn.equals("daoadmin"))
		{
			is= new InstagramDAO();
		}
		
		return is;
	}
}
