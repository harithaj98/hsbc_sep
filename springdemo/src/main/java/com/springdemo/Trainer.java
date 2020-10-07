package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tt")
public class Trainer implements TrainerInterface {
	
	@Autowired
	private LibraryInterface li;
	
	
	public void setLi(LibraryInterface li) {
		this.li = li;
	}


	public void teach() {
		System.out.println("teaching java");
		li.issuebooks();
	}
}
