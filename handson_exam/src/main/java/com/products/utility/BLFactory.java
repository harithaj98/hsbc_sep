package com.products.utility;


import com.products.businesslogic.ProductBL;
import com.products.businesslogic.ProductBLInterface;

public class BLFactory {
	
		private BLFactory(){
		
				}
	
	
	public static ProductBLInterface createObject(String st) {
		ProductBLInterface pb=null;
		
		if(st.equals("admin"))
			pb= new ProductBL();
		
		return pb;
	}


}
