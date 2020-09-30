package com.ajax.dao;

import java.util.ArrayList;

public interface DaoInterface {
	
	ArrayList<String> getStateDao(String n);
	ArrayList<String> getCityDao(String n);
	ArrayList<String> getCountryDao();
}
