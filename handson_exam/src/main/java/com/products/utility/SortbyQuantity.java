package com.products.utility;
import java.util.Comparator;
import com.products.entity.Product;

public class SortbyQuantity implements Comparator<Product>{

	 
		public int compare(Product p1, Product p2) {
			
			return p1.getQuantity().compareTo(p2.getQuantity());
		}


	}
	
	

