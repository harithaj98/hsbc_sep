package com.products.dao;

import java.util.ArrayList;
import java.util.List;

import com.products.entity.Apparel;
import com.products.entity.Electronics;
import com.products.entity.Food;
import com.products.entity.Product;
import com.products.utility.ListEmptyException;

public interface ProductsDaoInterface {

	
	void addProductsDao(Product fu);

	void viewProductsDao() throws ListEmptyException;

	
	
	
	

}
