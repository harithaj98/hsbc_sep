package com.products.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.products.entity.Apparel;
import com.products.entity.Electronics;
import com.products.entity.Food;
import com.products.entity.Product;
import com.products.utility.ListEmptyException;
import com.products.utility.SortbyQuantity;

public class ProductDao implements ProductsDaoInterface {

	private List<Product> lp=null;
	public ProductDao() {
		
		lp= new ArrayList<Product>();
	}
	
	


	@Override
	public void addProductsDao(Product fu) {
		// TODO Auto-generated method stub
		
		//adding items
		lp.add(fu);
		System.out.println("Item added");
		
	}




	@Override
	public void viewProductsDao() throws ListEmptyException{
		// TODO Auto-generated method stub
		
		//printing top3 products
		if(lp.size()==0)
			throw new ListEmptyException("");
		Collections.sort(lp, Collections.reverseOrder());
		for(Product p:lp)
		{
			System.out.println(p.getItemcode());
			System.out.println(p.getItemname());
			System.out.println(p.getQuantity());
			System.out.println(p.getWarranty());
		}
		
	}

	
	
	
}
