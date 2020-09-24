package com.products.utility;

import com.products.businesslogic.ProductBL;
import com.products.businesslogic.ProductBLInterface;
import com.products.dao.ProductDao;
import com.products.dao.ProductsDaoInterface;

public class DaoFactory {

	private DaoFactory(){
		
	}
	
	public static ProductsDaoInterface createObject(String st) {
			
		ProductsDaoInterface pd=null;
		
		if(st.equals("admin"))
			pd= new ProductDao();
		
		
		return pd;
	}
	
	

}
