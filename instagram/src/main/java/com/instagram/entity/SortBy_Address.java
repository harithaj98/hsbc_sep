package com.instagram.entity;

import java.util.Comparator;

public class SortBy_Address implements Comparator<InstagramUser>{

	@Override
	public int compare(InstagramUser f1, InstagramUser f2) {
		// TODO Auto-generated method stub
		return f1.getAddress().compareTo(f2.getAddress());
	}

	
}
