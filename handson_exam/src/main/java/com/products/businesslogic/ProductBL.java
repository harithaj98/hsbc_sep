package com.products.businesslogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import com.products.dao.ProductsDaoInterface;
import com.products.entity.Apparel;
import com.products.entity.Electronics;
import com.products.entity.Food;
import com.products.entity.Product;
import com.products.utility.DaoFactory;
import com.products.utility.ListEmptyException;
import com.products.utility.SortbyQuantity;

public class ProductBL implements ProductBLInterface {

	private ProductsDaoInterface pd;
	
	public ProductBL() {
		pd= DaoFactory.createObject("admin");
	}
	
	
	@Override
	public void addProducts(int choice) throws Exception {
		
		String itemcode;
		String itemname;
		String unitprice;
		String dateOfManufacture;
		String dateOfExpiry;
		String vegetarian;
		String quantity;
		String size;
		String warranty;
		
		System.out.println("Enter no of products you wish to add");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int i= Integer.parseInt(br.readLine());
		
		
		if(choice==1) {
			while(i!=0) {
			
			Food fu= new Food();
			System.out.println("*********");
			System.out.println("Enter itemcode");
			itemcode= br.readLine();
			System.out.println("Enter itemname");
			itemname= br.readLine();
			System.out.println("Enter unit price");
			unitprice= br.readLine();
			System.out.println("Enter date of manufacture");
			dateOfManufacture= br.readLine();
			System.out.println("Enter dateOfExpiry");
			dateOfExpiry= br.readLine();
			System.out.println("Enter vegetarian");
			vegetarian= br.readLine();
			System.out.println("Enter quantity");
			quantity= br.readLine();
			
			fu.setItemcode(itemcode);
			fu.setDateOfExpiry(dateOfExpiry);
			fu.setItemname(itemname);
			fu.setQuantity(quantity);
			fu.setDateOfManufacture(dateOfManufacture);
			fu.setUnitprice(unitprice);
			fu.setVegetarian(vegetarian);
			
			pd.addProductsDao(fu);
			
			i--;
			}
			
		}
		
		
		else if(choice==2) {
			while(i!=0) {
			
			Apparel au= new Apparel();
			System.out.println("*********");
			System.out.println("Enter itemcode");
			itemcode= br.readLine();
			System.out.println("Enter itemname");
			itemname= br.readLine();
			System.out.println("Enter unit price");
			unitprice= br.readLine();
			System.out.println("Enter size");
			size= br.readLine();
			System.out.println("Enter warranty");
			warranty= br.readLine();
			System.out.println("Enter quantity");
			quantity= br.readLine();
			
			au.setItemcode(itemcode);
			au.setItemname(itemname);
			au.setQuantity(quantity);
			au.setUnitprice(unitprice);
			au.setSize(size);
			au.setWarranty(warranty);
			
			pd.addProductsDao(au);
			
			i--;
			}
			
		}
		
		else if(choice==3) {
			while(i!=0) {
			Electronics eu= new Electronics();
			
			System.out.println("*********");
			System.out.println("Enter itemcode");
			itemcode= br.readLine();
			System.out.println("Enter itemname");
			itemname= br.readLine();
			System.out.println("Enter unit price");
			unitprice= br.readLine();
			System.out.println("Enter warranty");
			warranty= br.readLine();
			System.out.println("Enter quantity");
			quantity= br.readLine();
			
			eu.setItemcode(itemcode);
			eu.setItemname(itemname);
			eu.setQuantity(quantity);
			eu.setUnitprice(unitprice);
			eu.setWarranty(warranty);
			
			pd.addProductsDao(eu);
			
			i--;
			}
			
		}
		
	}

	


	@Override
	public void viewProducts(int choice) throws ListEmptyException{
		// TODO Auto-generated method stub
		try {
		
		pd.viewProductsDao();
		}
		
		catch(ListEmptyException t){
			throw t;
		}
		
		
		
	}

}
