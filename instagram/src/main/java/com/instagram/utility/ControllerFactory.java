package com.instagram.utility;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class ControllerFactory {

	private ControllerFactory() {
		
	}
	
	public static InstagramControllerInterface createObject(String nn) {
		
		InstagramControllerInterface is=null;
		
		if(nn.equals("controlleradmin")) {
			is= new InstagramController();
	
		}
		
		return is;
	}
}
