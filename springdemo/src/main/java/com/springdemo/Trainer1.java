package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("t1")
public class Trainer1 implements TrainerInterface{
	
	@Autowired
	private LibraryInterface li;
	
	
	public void setLi(LibraryInterface li) {
		this.li = li;
	}


	public void teach() {
		System.out.println("Trainer 1 teaching java");
		li.issuebooks();
	}

}
