package com.products.utility;

public class ListEmptyException extends Exception{
	
 public ListEmptyException(String string) {
		
	}
	
	
	@Override
	public String toString() {
		return "Empty List";
	}

}
