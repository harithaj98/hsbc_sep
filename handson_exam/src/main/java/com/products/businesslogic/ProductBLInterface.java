package com.products.businesslogic;

import com.products.utility.ListEmptyException;

public interface ProductBLInterface {

	void addProducts(int choice) throws Exception;

	void viewProducts(int choice) throws ListEmptyException;
	

}
