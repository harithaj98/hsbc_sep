package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Library implements LibraryInterface{
	public void issuebooks() {
		System.out.println("book issued");
	}
}
