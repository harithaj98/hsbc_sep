package com.ajax.dao;

import java.util.ArrayList;

public class cityDao implements DaoInterface {
	
	private ArrayList<String> list=null;
	
	public cityDao() {
		
		list= new ArrayList<>();
		list.add("Argentina");
		list.add("Armenia");
		list.add("Arizona");
		list.add("Bangladesh");
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Chattisgarh");
		
		
	}
	
	@Override
	public StringBuilder getCityDao(String n) {
		
		
		
		StringBuilder ret = new StringBuilder();
		for (String s: list) {
			if (s.contains(n)) {
				ret.append("," + s);
			}
		}


		return ret;
	}

}
