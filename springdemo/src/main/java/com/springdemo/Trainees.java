package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("def")
public class Trainees {

	@Autowired
	@Qualifier("t1")
	private TrainerInterface ti;
	
	@Autowired
	private LibraryInterface li;

	/*
	 * public Trainees(TrainerInterface ti) {//ADAPTER this.ti=ti; }
	 * 
	 * 
	 */

	/*
	 * public void setLi(LibraryInterface li) { this.li = li; }
	 * 
	 * 
	 * public void setTi(TrainerInterface ti) { //adapter this.ti = ti; }
	 */

	public void useTrainer() {
		ti.teach();
		li.issuebooks();
	}

	public void useliberary() {

		li.issuebooks();
	}

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("abc.xml");
		Trainees tt = (Trainees) ctx.getBean("def");

		// TrainerInterface ti1=new Trainer();
		// tt.setTi(ti1); //DI

		tt.useTrainer();
		tt.useliberary();
	}
}
