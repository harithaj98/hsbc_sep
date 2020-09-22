package com.instagram.entity;

import java.util.Comparator;

public class SortBy_Name implements Comparator<InstagramUser> {

	public int compare(InstagramUser f1, InstagramUser f2) {
		// TODO Auto-generated method stub
		return f1.getName().compareTo(f2.getName());
	}

}
